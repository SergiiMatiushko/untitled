
package org.doit;

public class Main {
    public static void main(String[] args) {
        MessageProvider provider = new SimpleMessageProvider();
        MessageRenderer renderer = new SimpleMessageRenderer(provider);

        renderer.render();
    }
}
