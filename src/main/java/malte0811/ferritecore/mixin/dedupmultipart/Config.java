package malte0811.ferritecore.mixin.dedupmultipart;

import malte0811.ferritecore.config.config.FerriteConfig;
import malte0811.ferritecore.config.config.FerriteMixinConfig;

public class Config extends FerriteMixinConfig {
    public Config() {
        super(FerriteConfig.DEDUP_MULTIPART);
    }
}
