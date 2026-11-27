package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5048lE0 {

    @NotNull
    public static final List<EnumC1976Sc> a;

    @NotNull
    public static final List<EnumC1976Sc> b;

    @NotNull
    public static final Object c;

    @NotNull
    public static final Object d;

    @NotNull
    public static final LinkedHashMap e;

    static {
        EnumC1976Sc enumC1976Sc = EnumC1976Sc.FIELD;
        EnumC1976Sc enumC1976Sc2 = EnumC1976Sc.METHOD_RETURN_TYPE;
        EnumC1976Sc enumC1976Sc3 = EnumC1976Sc.VALUE_PARAMETER;
        List<EnumC1976Sc> listF = WE.f(enumC1976Sc, enumC1976Sc2, enumC1976Sc3, EnumC1976Sc.TYPE_PARAMETER_BOUNDS, EnumC1976Sc.TYPE_USE);
        a = listF;
        List<EnumC1976Sc> listC = VE.c(enumC1976Sc3);
        b = listC;
        C1758Ph0 c1758Ph0 = C3542eI0.a;
        EnumC5238m71 enumC5238m71 = EnumC5238m71.g;
        Map mapE = PW0.e(new Pair(c1758Ph0, new C4838kE0(new C5448n71(enumC5238m71, false), listF, false)), new Pair(C3542eI0.b, new C4838kE0(new C5448n71(enumC5238m71, false), listF, false)), new Pair(C3542eI0.c, new C4838kE0(new C5448n71(EnumC5238m71.d, false), listF)));
        c = mapE;
        Map mapE2 = PW0.e(new Pair(C3542eI0.h, new C4838kE0(new C5448n71(enumC5238m71, false), listC)), new Pair(C3542eI0.i, new C4838kE0(new C5448n71(EnumC5238m71.e, false), listC)));
        d = mapE2;
        e = PW0.g(mapE, mapE2);
    }
}
