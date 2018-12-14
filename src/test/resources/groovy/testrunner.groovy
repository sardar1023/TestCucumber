/*
* Genarates test runner class based on a template supplied in the properties
*/

import groovy.io.FileType

import java.nio.file.Files



def dir = new File(properties['features']);
def newFileName;
def newClassName;
def newFile;
def filePath;
def templateFile = new File(properties['runner.template']);
def orderdedFilesDone =true;

if(!dir.exists()) {
    return;
}

dir.eachFile(FileType.FILES){
    file ->
        if(!file.name.endsWith(".feature")){
            return;
        }

        newClassName = 'Tr' + file.name.replace(".feature","Runner");

        filePath =file.path.replaceAll("\\\\","/");

        newFileName = sprintf('%1$s%1$s%3$s.java',
                properties['generated.sources.directory'],
                System.getProperty("file.separator"),
                newClassName);

        newFile = new File(newFileName);

        newFile.parentFile.mkdirs();

        if(newFile.exists()){
            Files.delete(newFile.toPath());
        }

        Files.createFile(newFile.toPath());

        newFile.withWriter { w ->
            templateFile.eachLine { line ->
                w << line
                        .replaceAll('@FEATURES@',filePath)
                        .replaceAll('@CLASSNAME@',newClassName) +
                         System.getProperty("line.separator");
            }
        }
        
}
