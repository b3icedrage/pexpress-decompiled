package com.jivosite.sdk.model.pojo.rate;

import defpackage.C1039Gc0;
import defpackage.EF0;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0011\u0012BS\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\\\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/jivosite/sdk/model/pojo/rate/RateSettings;", "", "Lcom/jivosite/sdk/model/pojo/rate/RateSettings$b;", "type", "Lcom/jivosite/sdk/model/pojo/rate/RateSettings$a;", "icon", "", "conditionName", "", "conditionValue", "customTitle", "goodRateTitle", "badRateTitle", "<init>", "(Lcom/jivosite/sdk/model/pojo/rate/RateSettings$b;Lcom/jivosite/sdk/model/pojo/rate/RateSettings$a;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/jivosite/sdk/model/pojo/rate/RateSettings$b;Lcom/jivosite/sdk/model/pojo/rate/RateSettings$a;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/jivosite/sdk/model/pojo/rate/RateSettings;", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RateSettings {

    @NotNull
    public final b a;

    @NotNull
    public final a b;

    @NotNull
    public final String c;
    public final int d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    public enum a {
        UNKNOWN("unknown"),
        /* JADX INFO: Fake field, exist only in values array */
        SMILE("smile"),
        /* JADX INFO: Fake field, exist only in values array */
        STAR("star");


        @NotNull
        public final String d;

        a(String str) {
            this.d = str;
        }
    }

    public enum b {
        UNKNOWN("unknown"),
        /* JADX INFO: Fake field, exist only in values array */
        TWO("two"),
        /* JADX INFO: Fake field, exist only in values array */
        THREE("three"),
        /* JADX INFO: Fake field, exist only in values array */
        FIVE("five");


        @NotNull
        public final String d;

        b(String str) {
            this.d = str;
        }
    }

    public RateSettings(@InterfaceC5477nG0(name = "type") @NotNull b type, @InterfaceC5477nG0(name = "icon") @NotNull a icon, @InterfaceC5477nG0(name = "condition_name") @NotNull String conditionName, @InterfaceC5477nG0(name = "condition_value") int i, @InterfaceC5477nG0(name = "custom_title") @Nullable String str, @InterfaceC5477nG0(name = "good_rate_title") @Nullable String str2, @InterfaceC5477nG0(name = "bad_rate_title") @Nullable String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(conditionName, "conditionName");
        this.a = type;
        this.b = icon;
        this.c = conditionName;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    @NotNull
    public final RateSettings copy(@InterfaceC5477nG0(name = "type") @NotNull b type, @InterfaceC5477nG0(name = "icon") @NotNull a icon, @InterfaceC5477nG0(name = "condition_name") @NotNull String conditionName, @InterfaceC5477nG0(name = "condition_value") int conditionValue, @InterfaceC5477nG0(name = "custom_title") @Nullable String customTitle, @InterfaceC5477nG0(name = "good_rate_title") @Nullable String goodRateTitle, @InterfaceC5477nG0(name = "bad_rate_title") @Nullable String badRateTitle) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(conditionName, "conditionName");
        return new RateSettings(type, icon, conditionName, conditionValue, customTitle, goodRateTitle, badRateTitle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RateSettings)) {
            return false;
        }
        RateSettings rateSettings = (RateSettings) obj;
        return this.a == rateSettings.a && this.b == rateSettings.b && Intrinsics.a(this.c, rateSettings.c) && this.d == rateSettings.d && Intrinsics.a(this.e, rateSettings.e) && Intrinsics.a(this.f, rateSettings.f) && Intrinsics.a(this.g, rateSettings.g);
    }

    public final int hashCode() {
        int iA = EF0.a(this.d, C1039Gc0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RateSettings(type=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", conditionName=");
        sb.append(this.c);
        sb.append(", conditionValue=");
        sb.append(this.d);
        sb.append(", customTitle=");
        sb.append(this.e);
        sb.append(", goodRateTitle=");
        sb.append(this.f);
        sb.append(", badRateTitle=");
        return C1039Gc0.e(sb, this.g, ')');
    }

    public /* synthetic */ RateSettings(b bVar, a aVar, String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, aVar, str, i, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4);
    }
}
