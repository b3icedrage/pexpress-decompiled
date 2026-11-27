package com.jivosite.sdk.model.pojo.push;

import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.C3903g11;
import defpackage.C6596sc2;
import defpackage.C6702t60;
import defpackage.EG0;
import defpackage.YH0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.push.DeviceJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/push/DeviceJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/push/Device;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<Device> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    @Nullable
    public volatile Constructor<Device> c;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("device_id", "platform", "token");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"device_id\", \"platform\", \"token\")");
        this.a = aVarA;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, C6702t60.d, "deviceId");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…ySet(),\n      \"deviceId\")");
        this.b = abstractC5897pG0C;
    }

    @Override // defpackage.AbstractC5897pG0
    public final Device a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        int i = -1;
        while (reader.hasNext()) {
            int iQ = reader.q(this.a);
            if (iQ == -1) {
                reader.u();
                reader.I();
            } else if (iQ == 0) {
                strA = this.b.a(reader);
                if (strA == null) {
                    EG0 eg0L = C6596sc2.l("deviceId", "device_id", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"deviceId…     \"device_id\", reader)");
                    throw eg0L;
                }
            } else if (iQ == 1) {
                strA2 = this.b.a(reader);
                if (strA2 == null) {
                    EG0 eg0L2 = C6596sc2.l("platform", "platform", reader);
                    Intrinsics.checkNotNullExpressionValue(eg0L2, "unexpectedNull(\"platform…      \"platform\", reader)");
                    throw eg0L2;
                }
                i = -3;
            } else if (iQ == 2 && (strA3 = this.b.a(reader)) == null) {
                EG0 eg0L3 = C6596sc2.l("token", "token", reader);
                Intrinsics.checkNotNullExpressionValue(eg0L3, "unexpectedNull(\"token\", …ken\",\n            reader)");
                throw eg0L3;
            }
        }
        reader.B0();
        if (i == -3) {
            if (strA == null) {
                EG0 eg0F = C6596sc2.f("deviceId", "device_id", reader);
                Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"deviceId\", \"device_id\", reader)");
                throw eg0F;
            }
            Intrinsics.c(strA2, "null cannot be cast to non-null type kotlin.String");
            if (strA3 != null) {
                return new Device(strA, strA2, strA3);
            }
            EG0 eg0F2 = C6596sc2.f("token", "token", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"token\", \"token\", reader)");
            throw eg0F2;
        }
        Constructor<Device> declaredConstructor = this.c;
        if (declaredConstructor == null) {
            declaredConstructor = Device.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, C6596sc2.c);
            this.c = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "Device::class.java.getDe…his.constructorRef = it }");
        }
        if (strA == null) {
            EG0 eg0F3 = C6596sc2.f("deviceId", "device_id", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F3, "missingProperty(\"deviceId\", \"device_id\", reader)");
            throw eg0F3;
        }
        if (strA3 != null) {
            Device deviceNewInstance = declaredConstructor.newInstance(strA, strA2, strA3, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(deviceNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return deviceNewInstance;
        }
        EG0 eg0F4 = C6596sc2.f("token", "token", reader);
        Intrinsics.checkNotNullExpressionValue(eg0F4, "missingProperty(\"token\", \"token\", reader)");
        throw eg0F4;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, Device device) {
        Device device2 = device;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (device2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("device_id");
        AbstractC5897pG0<String> abstractC5897pG0 = this.b;
        abstractC5897pG0.e(writer, device2.a);
        writer.q("platform");
        abstractC5897pG0.e(writer, device2.b);
        writer.q("token");
        abstractC5897pG0.e(writer, device2.c);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(Device)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
