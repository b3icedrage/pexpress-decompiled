package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class E41 {

    @NotNull
    public final Kh2 a;

    @NotNull
    public final InterfaceC7874yh b;

    @NotNull
    public final BR c;

    public E41(@NotNull Kh2 externalLinks, @NotNull InterfaceC7874yh appLinkLauncher, @NotNull BR customTabs) {
        Intrinsics.checkNotNullParameter(externalLinks, "externalLinks");
        Intrinsics.checkNotNullParameter(appLinkLauncher, "appLinkLauncher");
        Intrinsics.checkNotNullParameter(customTabs, "customTabs");
        this.a = externalLinks;
        this.b = appLinkLauncher;
        this.c = customTabs;
    }

    public final D41 a(Context context, String str) {
        InterfaceC7874yh interfaceC7874yh = this.b;
        C7664xh c7664xh = interfaceC7874yh.parse(str);
        if (c7664xh == null) {
            return D41.b.a;
        }
        if (interfaceC7874yh.a(context, c7664xh)) {
            return D41.c.a;
        }
        if (this.c.a(context, str)) {
            return D41.f.a;
        }
        return interfaceC7874yh.c(context, c7664xh) ? D41.e.a : D41.d.a;
    }
}
