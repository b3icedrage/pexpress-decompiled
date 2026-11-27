package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2979bd {
    public static final /* synthetic */ IJ0<Object>[] a;

    @NotNull
    public static final C5658o71 b;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        a = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.c(C2979bd.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        C5655o62.a aVar = C5655o62.e;
        RI0 kClass = c2251Vp1.b(C2755ad.class);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String keyQualifiedName = kClass.d();
        Intrinsics.checkNotNull(keyQualifiedName);
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        b = new C5658o71(aVar.b(aVar.a, keyQualifiedName, new JC(aVar, 1)));
    }

    @NotNull
    public static final InterfaceC2396Xc a(@NotNull C5655o62 thisRef) {
        InterfaceC2396Xc interfaceC2396Xc;
        Intrinsics.checkNotNullParameter(thisRef, "<this>");
        Intrinsics.checkNotNullParameter(thisRef, "<this>");
        IJ0<Object> property = a[0];
        C5658o71 c5658o71 = b;
        c5658o71.getClass();
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        C2755ad c2755ad = (C2755ad) thisRef.b().get(c5658o71.a);
        return (c2755ad == null || (interfaceC2396Xc = c2755ad.a) == null) ? InterfaceC2396Xc.a.a : interfaceC2396Xc;
    }
}
