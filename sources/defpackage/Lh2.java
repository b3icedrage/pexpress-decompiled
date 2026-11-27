package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Lh2 implements Kh2 {

    @NotNull
    public final InterfaceC7874yh a;

    public Lh2(@NotNull InterfaceC7874yh appLinkLauncher) {
        Intrinsics.checkNotNullParameter(appLinkLauncher, "appLinkLauncher");
        this.a = appLinkLauncher;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.Kh2
    @NotNull
    public final InterfaceC2205Va0 a(@NotNull Context context, @NotNull String url, boolean z) {
        String str;
        InterfaceC2205Va0 fVar;
        String str2;
        Uri data;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (C6620si2.a(url)) {
            return InterfaceC2205Va0.g.a;
        }
        InterfaceC7874yh interfaceC7874yh = this.a;
        C7664xh c7664xh = interfaceC7874yh.parse(url);
        if (c7664xh == null) {
            fVar = InterfaceC2205Va0.a.a;
        } else {
            String scheme = c7664xh.b;
            if (scheme != null) {
                Intrinsics.checkNotNullParameter(scheme, "scheme");
                String lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (C6620si2.b.contains(lowerCase)) {
                    fVar = InterfaceC2205Va0.c.a;
                } else if (interfaceC7874yh.a(context, c7664xh)) {
                    fVar = InterfaceC2205Va0.b.a;
                } else if (interfaceC7874yh.c(context, c7664xh)) {
                    fVar = InterfaceC2205Va0.d.a;
                } else if (z || (str2 = c7664xh.d) == null) {
                    str = c7664xh.c;
                    if (str == null) {
                        if (scheme != null) {
                            Object obj = C2225Vh.a;
                            Intrinsics.checkNotNullParameter(scheme, "scheme");
                            ?? r11 = C2225Vh.a;
                            String lowerCase2 = scheme.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            str = (String) r11.get(lowerCase2);
                        } else {
                            str = null;
                        }
                    }
                    if (str == null && interfaceC7874yh.b(context, str)) {
                        fVar = InterfaceC2205Va0.e.a;
                    } else {
                        fVar = InterfaceC2205Va0.h.a;
                    }
                } else {
                    fVar = new InterfaceC2205Va0.f(str2);
                }
            } else if (interfaceC7874yh.a(context, c7664xh)) {
                fVar = InterfaceC2205Va0.b.a;
            } else if (interfaceC7874yh.c(context, c7664xh)) {
                fVar = InterfaceC2205Va0.d.a;
            } else if (z) {
                str = c7664xh.c;
                if (str == null) {
                    if (scheme != null) {
                        Object obj2 = C2225Vh.a;
                        Intrinsics.checkNotNullParameter(scheme, "scheme");
                        ?? r12 = C2225Vh.a;
                        String lowerCase3 = scheme.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                        str = (String) r12.get(lowerCase3);
                    } else {
                        str = null;
                    }
                }
                if (str == null) {
                    fVar = InterfaceC2205Va0.h.a;
                } else {
                    fVar = InterfaceC2205Va0.h.a;
                }
            } else {
                str = c7664xh.c;
                if (str == null) {
                    if (scheme != null) {
                        Object obj3 = C2225Vh.a;
                        Intrinsics.checkNotNullParameter(scheme, "scheme");
                        ?? r13 = C2225Vh.a;
                        String lowerCase4 = scheme.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                        str = (String) r13.get(lowerCase4);
                    } else {
                        str = null;
                    }
                }
                if (str == null) {
                    fVar = InterfaceC2205Va0.h.a;
                } else {
                    fVar = InterfaceC2205Va0.h.a;
                }
            }
        }
        fVar.getClass();
        C6620si2.b(url);
        if (c7664xh != null && (data = c7664xh.a.getData()) != null) {
            data.getHost();
        }
        return fVar;
    }
}
