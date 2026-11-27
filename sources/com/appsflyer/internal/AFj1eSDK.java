package com.appsflyer.internal;

import com.appsflyer.share.platform_extension.Plugin;
import com.appsflyer.share.platform_extension.PluginInfo;
import defpackage.C1673Of;
import defpackage.InterfaceC3770fO0;
import defpackage.PW0;
import defpackage.XO0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1eSDK implements AFj1cSDK {

    @NotNull
    private final InterfaceC3770fO0 AFKeystoreWrapper = XO0.b(new C1673Of(1));

    @Nullable
    private PluginInfo AFLogger;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PluginInfo AFKeystoreWrapper() {
        return new PluginInfo(Plugin.NATIVE, "7.0.1", null, 4, null);
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    @NotNull
    public final Map<String, Object> AFLogger() {
        PluginInfo pluginInfo = this.AFLogger;
        if (pluginInfo == null) {
            pluginInfo = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        Pair pair = new Pair("platform", pluginInfo.getPlugin().getPluginName());
        PluginInfo pluginInfo2 = this.AFLogger;
        if (pluginInfo2 == null) {
            pluginInfo2 = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        LinkedHashMap linkedHashMapF = PW0.f(pair, new Pair("version", pluginInfo2.getVersion()));
        PluginInfo pluginInfo3 = this.AFLogger;
        if (pluginInfo3 == null) {
            pluginInfo3 = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        if (!pluginInfo3.getAdditionalParams().isEmpty()) {
            PluginInfo pluginInfo4 = this.AFLogger;
            if (pluginInfo4 == null) {
                pluginInfo4 = (PluginInfo) this.AFKeystoreWrapper.getValue();
            }
            linkedHashMapF.put("extras", pluginInfo4.getAdditionalParams());
        }
        return linkedHashMapF;
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    public final void registerClient(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFLogger = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFj1cSDK
    @NotNull
    public final String unregisterClient() {
        PluginInfo pluginInfo = this.AFLogger;
        if (pluginInfo == null) {
            pluginInfo = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        return pluginInfo.getPlugin().getPluginName();
    }
}
