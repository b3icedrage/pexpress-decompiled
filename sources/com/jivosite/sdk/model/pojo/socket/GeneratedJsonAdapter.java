package com.jivosite.sdk.model.pojo.socket;

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

/* JADX INFO: renamed from: com.jivosite.sdk.model.pojo.socket.SocketMessageJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/jivosite/sdk/model/pojo/socket/SocketMessageJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/socket/SocketMessage;", "Lg11;", "moshi", "<init>", "(Lg11;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeneratedJsonAdapter extends AbstractC5897pG0<SocketMessage> {

    @NotNull
    public final AbstractC8000zH0.a a;

    @NotNull
    public final AbstractC5897pG0<String> b;

    @NotNull
    public final AbstractC5897pG0<String> c;

    @Nullable
    public volatile Constructor<SocketMessage> d;

    public GeneratedJsonAdapter(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC8000zH0.a aVarA = AbstractC8000zH0.a.a("type", "data", "id", "context", "to", "from", "parent");
        Intrinsics.checkNotNullExpressionValue(aVarA, "of(\"type\", \"data\", \"id\",…  \"to\", \"from\", \"parent\")");
        this.a = aVarA;
        C6702t60 c6702t60 = C6702t60.d;
        AbstractC5897pG0<String> abstractC5897pG0C = moshi.c(String.class, c6702t60, "type");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.b = abstractC5897pG0C;
        AbstractC5897pG0<String> abstractC5897pG0C2 = moshi.c(String.class, c6702t60, "data");
        Intrinsics.checkNotNullExpressionValue(abstractC5897pG0C2, "moshi.adapter(String::cl…      emptySet(), \"data\")");
        this.c = abstractC5897pG0C2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final SocketMessage a(AbstractC8000zH0 reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.X0();
        int i = -1;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        String strA4 = null;
        String strA5 = null;
        String strA6 = null;
        String strA7 = null;
        while (reader.hasNext()) {
            switch (reader.q(this.a)) {
                case -1:
                    reader.u();
                    reader.I();
                    break;
                case 0:
                    strA = this.b.a(reader);
                    if (strA == null) {
                        EG0 eg0L = C6596sc2.l("type", "type", reader);
                        Intrinsics.checkNotNullExpressionValue(eg0L, "unexpectedNull(\"type\", \"type\",\n            reader)");
                        throw eg0L;
                    }
                    break;
                    break;
                case 1:
                    strA2 = this.c.a(reader);
                    i &= -3;
                    break;
                case 2:
                    strA3 = this.c.a(reader);
                    i &= -5;
                    break;
                case 3:
                    strA4 = this.c.a(reader);
                    i &= -9;
                    break;
                case 4:
                    strA5 = this.c.a(reader);
                    i &= -17;
                    break;
                case 5:
                    strA6 = this.c.a(reader);
                    i &= -33;
                    break;
                case 6:
                    strA7 = this.c.a(reader);
                    i &= -65;
                    break;
            }
        }
        reader.B0();
        if (i == -127) {
            String str = strA7;
            String str2 = strA6;
            String str3 = strA5;
            String str4 = strA4;
            String str5 = strA3;
            String str6 = strA2;
            String str7 = strA;
            if (str7 != null) {
                return new SocketMessage(str7, str6, str5, str4, str3, str2, str);
            }
            EG0 eg0F = C6596sc2.f("type", "type", reader);
            Intrinsics.checkNotNullExpressionValue(eg0F, "missingProperty(\"type\", \"type\", reader)");
            throw eg0F;
        }
        String str8 = strA7;
        String str9 = strA6;
        String str10 = strA5;
        String str11 = strA4;
        String str12 = strA3;
        String str13 = strA2;
        String str14 = strA;
        Constructor<SocketMessage> declaredConstructor = this.d;
        if (declaredConstructor == null) {
            declaredConstructor = SocketMessage.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, C6596sc2.c);
            this.d = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "SocketMessage::class.jav…his.constructorRef = it }");
        }
        if (str14 != null) {
            SocketMessage socketMessageNewInstance = declaredConstructor.newInstance(str14, str13, str12, str11, str10, str9, str8, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(socketMessageNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return socketMessageNewInstance;
        }
        EG0 eg0F2 = C6596sc2.f("type", "type", reader);
        Intrinsics.checkNotNullExpressionValue(eg0F2, "missingProperty(\"type\", \"type\", reader)");
        throw eg0F2;
    }

    @Override // defpackage.AbstractC5897pG0
    public final void e(YH0 writer, SocketMessage socketMessage) {
        SocketMessage socketMessage2 = socketMessage;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (socketMessage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.q("type");
        this.b.e(writer, socketMessage2.a);
        writer.q("data");
        AbstractC5897pG0<String> abstractC5897pG0 = this.c;
        abstractC5897pG0.e(writer, socketMessage2.b);
        writer.q("id");
        abstractC5897pG0.e(writer, socketMessage2.c);
        writer.q("context");
        abstractC5897pG0.e(writer, socketMessage2.d);
        writer.q("to");
        abstractC5897pG0.e(writer, socketMessage2.e);
        writer.q("from");
        abstractC5897pG0.e(writer, socketMessage2.f);
        writer.q("parent");
        abstractC5897pG0.e(writer, socketMessage2.g);
        writer.l();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(SocketMessage)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
