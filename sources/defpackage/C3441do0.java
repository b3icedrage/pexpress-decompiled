package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: do0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3441do0 extends C8034zS1 {
    @Override // defpackage.C8034zS1
    public final void g(@NotNull String headerName) {
        Intrinsics.checkNotNullParameter(headerName, "name");
        super.g(headerName);
        List<String> list = C1159Hq0.a;
        Intrinsics.checkNotNullParameter(headerName, "name");
        int i = 0;
        int i2 = 0;
        while (i < headerName.length()) {
            char cCharAt = headerName.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.e(cCharAt, 32) <= 0 || StringsKt.D("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                Intrinsics.checkNotNullParameter(headerName, "headerName");
                StringBuilder sbB = C6495s7.b("Header name '", headerName, "' contains illegal character '");
                sbB.append(headerName.charAt(i2));
                sbB.append("' (code ");
                sbB.append(headerName.charAt(i2) & 255);
                sbB.append(')');
                throw new C3465dw0(sbB.toString());
            }
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.C8034zS1
    public final void h(@NotNull String headerValue) {
        Intrinsics.checkNotNullParameter(headerValue, "value");
        super.h(headerValue);
        List<String> list = C1159Hq0.a;
        Intrinsics.checkNotNullParameter(headerValue, "value");
        int i = 0;
        int i2 = 0;
        while (i < headerValue.length()) {
            char cCharAt = headerValue.charAt(i);
            int i3 = i2 + 1;
            if (Intrinsics.e(cCharAt, 32) < 0 && cCharAt != '\t') {
                Intrinsics.checkNotNullParameter(headerValue, "headerValue");
                StringBuilder sbB = C6495s7.b("Header value '", headerValue, "' contains illegal character '");
                sbB.append(headerValue.charAt(i2));
                sbB.append("' (code ");
                sbB.append(headerValue.charAt(i2) & 255);
                sbB.append(')');
                throw new C3675ew0(sbB.toString());
            }
            i++;
            i2 = i3;
        }
    }
}
