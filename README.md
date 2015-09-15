gwt-ZeroClipboard
===========


   GWT wrapper on top of Javascript library of ZeroClipboard http://zeroclipboard.org/
   
**Usage**
--------
Inherit main GWT module ```	<inherits name="com.agnie.gwt.zeroclipboard.ZeroClipBoard" />```

**Maven Dependency**
```
	<dependency>
		<groupId>com.agnie.gwt</groupId>
		<artifactId>zeroclipboard</artifactId>
		<version>1.0-SNAPSHOT</version>
		<scope>provided</scope>
	</dependency>
```

Sample Code

```
import com.agnie.gwt.zeroclipboard.client.CopyEvent;
import com.agnie.gwt.zeroclipboard.client.CopyHandler;
import com.agnie.gwt.zeroclipboard.client.ZeroClipBoard;
import com.agnie.gwt.zeroclipboard.client.ZeroClipBoardClient;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class ZeroClipBoardEntryModuleTest implements EntryPoint {

    @Override
    public void onModuleLoad() {
        Button copyMyText = new Button("Copy My Text");
        RootPanel.get().add(copyMyText);
        final ZeroClipBoardClient client = ZeroClipBoard.getInstance().getNewClient(copyMyText.getElement());
        client.addCopyClickHandler(new CopyHandler() {

            @Override
            public void onSelection(CopyEvent event) {
                client.getClient().setText("This our GWT Copy Text");
            }
        });

    }
}
```


**Maven Repository**

```
   <repositories>
      <repository>
         <id>Agnie repo</id>
         <url>https://github.com/Agnie-Software/mvn-repo/raw/master/releases</url>
      </repository>
   </repositories>
```

**Important Note:** 
------
Wrapper for all features are not added, Please feel free to make changes add wrappers for remaining features.
