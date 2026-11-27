package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import defpackage.PW0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1hSDK implements AFa1lSDK {

    @NotNull
    private final AFc1kSDK d;

    public AFa1hSDK(@NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.d = aFc1kSDK;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void d(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.d.d("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void registerClient() {
        this.d.AFLogger("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    @NotNull
    public final Map<String, Object> unregisterClient() {
        if (this.d.registerClient("deeplink_data")) {
            try {
                String strD = this.d.d("deeplink_data");
                return strD == null ? PW0.c() : JsonUtils.toMap(new JSONObject(strD));
            } catch (Throwable th) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "Exception while parsing stored deeplink data", th, false, true, false, false, 72, null);
            }
        }
        return PW0.c();
    }
}
