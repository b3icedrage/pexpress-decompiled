package defpackage;

import java.net.URI;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: aW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2731aW implements FN1 {

    @NotNull
    public final C6102qE1 a;

    @NotNull
    public final EK1 b;

    public C2731aW(@NotNull C6102qE1 sdkContext, @NotNull EK1 storage) {
        Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = sdkContext;
        this.b = storage;
    }

    @Override // defpackage.FN1
    @NotNull
    public final URI a() {
        URI uriCreate;
        EK1 ek1 = this.b;
        ek1.getClass();
        IJ0<Object>[] ij0Arr = EK1.z;
        String str = (String) ek1.c.a(ij0Arr[2], ek1);
        boolean zI = StringsKt.I(str);
        C6749tK1 c6749tK1 = ek1.e;
        if (zI) {
            StringBuilder sb = new StringBuilder("wss://");
            sb.append((String) c6749tK1.a(ij0Arr[4], ek1));
            sb.append("/atom/");
            sb.append(ek1.d());
            sb.append(':');
            String strE = ek1.e();
            if (StringsKt.I(strE)) {
                strE = this.a.b;
            }
            sb.append(strE);
            String str2 = (String) ek1.k.a(ij0Arr[11], ek1);
            sb.append(!StringsKt.I(str2) ? "?token=".concat(str2) : "");
            uriCreate = URI.create(sb.toString());
        } else {
            uriCreate = URI.create("wss://" + ((String) c6749tK1.a(ij0Arr[4], ek1)) + "/atom" + str);
        }
        Intrinsics.checkNotNullExpressionValue(uriCreate, "storage.path.let {\n     …)\n            }\n        }");
        return uriCreate;
    }
}
