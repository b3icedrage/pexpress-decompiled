package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class YC {

    @NotNull
    public final String a;

    @NotNull
    public C5653o60 b;

    @NotNull
    public final ArrayList c;

    @NotNull
    public final HashSet d;

    @NotNull
    public final ArrayList e;

    @NotNull
    public final ArrayList f;

    @NotNull
    public final ArrayList g;

    public YC(@NotNull String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.a = serialName;
        this.b = C5653o60.d;
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public static void a(YC yc, String elementName, MH1 descriptor) {
        C5653o60 annotations = C5653o60.d;
        yc.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!yc.d.add(elementName)) {
            StringBuilder sbB = C6495s7.b("Element with name '", elementName, "' is already registered in ");
            sbB.append(yc.a);
            throw new IllegalArgumentException(sbB.toString().toString());
        }
        yc.c.add(elementName);
        yc.e.add(descriptor);
        yc.f.add(annotations);
        yc.g.add(false);
    }
}
