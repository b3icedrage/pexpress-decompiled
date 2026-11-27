package com.jivosite.sdk.model.pojo.push;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/jivosite/sdk/model/pojo/push/Device;", "", "", "deviceId", "platform", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/jivosite/sdk/model/pojo/push/Device;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Device {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    public Device(@InterfaceC5477nG0(name = "device_id") @NotNull String deviceId, @InterfaceC5477nG0(name = "platform") @NotNull String platform, @InterfaceC5477nG0(name = "token") @NotNull String token) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(token, "token");
        this.a = deviceId;
        this.b = platform;
        this.c = token;
    }

    @NotNull
    public final Device copy(@InterfaceC5477nG0(name = "device_id") @NotNull String deviceId, @InterfaceC5477nG0(name = "platform") @NotNull String platform, @InterfaceC5477nG0(name = "token") @NotNull String token) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(token, "token");
        return new Device(deviceId, platform, token);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return Intrinsics.a(this.a, device.a) && Intrinsics.a(this.b, device.b) && Intrinsics.a(this.c, device.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Device(deviceId=");
        sb.append(this.a);
        sb.append(", platform=");
        sb.append(this.b);
        sb.append(", token=");
        return C1039Gc0.e(sb, this.c, ')');
    }

    public /* synthetic */ Device(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "android" : str2, str3);
    }
}
