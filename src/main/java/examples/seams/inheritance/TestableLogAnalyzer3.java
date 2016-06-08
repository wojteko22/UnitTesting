package examples.seams.inheritance;

import examples.seams.IExtensionManager;

/**
 * @author Dawid on 2016-06-08.
 */
class TestableLogAnalyzer3 extends LogAnalyzer3 {
    private IExtensionManager manager;

    TestableLogAnalyzer3(IExtensionManager manager) {
        this.manager = manager;
    }

    @Override
    protected IExtensionManager getManager() {
        return manager;
    }
}
