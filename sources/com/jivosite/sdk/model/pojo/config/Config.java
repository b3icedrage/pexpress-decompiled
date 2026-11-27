package com.jivosite.sdk.model.pojo.config;

import com.jivosite.sdk.model.pojo.rate.RateSettings;
import com.jivosite.sdk.model.pojo.response.Response;
import defpackage.C1039Gc0;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\\\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/jivosite/sdk/model/pojo/config/Config;", "Lcom/jivosite/sdk/model/pojo/response/Response;", "", "siteId", "chatserverHost", "apiHost", "filesHost", "", "license", "", "showRateForm", "Lcom/jivosite/sdk/model/pojo/rate/RateSettings;", "rateSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/jivosite/sdk/model/pojo/rate/RateSettings;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/jivosite/sdk/model/pojo/rate/RateSettings;)Lcom/jivosite/sdk/model/pojo/config/Config;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Config extends Response {

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    @NotNull
    public final String f;

    @Nullable
    public final Boolean g;

    @Nullable
    public final Integer h;

    @Nullable
    public final RateSettings i;

    public /* synthetic */ Config(String str, String str2, String str3, String str4, Boolean bool, Integer num, RateSettings rateSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : rateSettings);
    }

    @NotNull
    public final Config copy(@InterfaceC5477nG0(name = "site_id") @NotNull String siteId, @InterfaceC5477nG0(name = "chatserver_host") @NotNull String chatserverHost, @InterfaceC5477nG0(name = "api_host") @NotNull String apiHost, @InterfaceC5477nG0(name = "files_host") @NotNull String filesHost, @InterfaceC5477nG0(name = "license") @Nullable Boolean license, @InterfaceC5477nG0(name = "show_rate_form") @Nullable Integer showRateForm, @InterfaceC5477nG0(name = "rate_settings") @Nullable RateSettings rateSettings) {
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(chatserverHost, "chatserverHost");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(filesHost, "filesHost");
        return new Config(siteId, chatserverHost, apiHost, filesHost, license, showRateForm, rateSettings);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return Intrinsics.a(this.c, config.c) && Intrinsics.a(this.d, config.d) && Intrinsics.a(this.e, config.e) && Intrinsics.a(this.f, config.f) && Intrinsics.a(this.g, config.g) && Intrinsics.a(this.h, config.h) && Intrinsics.a(this.i, config.i);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
        Boolean bool = this.g;
        int iHashCode = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        RateSettings rateSettings = this.i;
        return iHashCode2 + (rateSettings != null ? rateSettings.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Config(siteId=" + this.c + ", chatserverHost=" + this.d + ", apiHost=" + this.e + ", filesHost=" + this.f + ", license=" + this.g + ", showRateForm=" + this.h + ", rateSettings=" + this.i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Config(@InterfaceC5477nG0(name = "site_id") @NotNull String siteId, @InterfaceC5477nG0(name = "chatserver_host") @NotNull String chatserverHost, @InterfaceC5477nG0(name = "api_host") @NotNull String apiHost, @InterfaceC5477nG0(name = "files_host") @NotNull String filesHost, @InterfaceC5477nG0(name = "license") @Nullable Boolean bool, @InterfaceC5477nG0(name = "show_rate_form") @Nullable Integer num, @InterfaceC5477nG0(name = "rate_settings") @Nullable RateSettings rateSettings) {
        super(false, null, 3, null);
        Intrinsics.checkNotNullParameter(siteId, "siteId");
        Intrinsics.checkNotNullParameter(chatserverHost, "chatserverHost");
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(filesHost, "filesHost");
        this.c = siteId;
        this.d = chatserverHost;
        this.e = apiHost;
        this.f = filesHost;
        this.g = bool;
        this.h = num;
        this.i = rateSettings;
    }
}
