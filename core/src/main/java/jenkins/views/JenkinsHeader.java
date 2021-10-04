package jenkins.views;

import hudson.Extension;

@Extension(ordinal = Integer.MIN_VALUE)
public class JenkinsHeader extends Header {

    @Override
    public boolean isHeaderEnabled() {
        return true;
    }

}
