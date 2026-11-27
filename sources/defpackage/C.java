package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C<TAnnotation> {

    @NotNull
    public static final LinkedHashMap c;

    @NotNull
    public final XE0 a;

    @NotNull
    public final ConcurrentHashMap<Object, TAnnotation> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1976Sc enumC1976Sc : EnumC1976Sc.values()) {
            String str = enumC1976Sc.d;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC1976Sc);
            }
        }
        c = linkedHashMap;
    }

    public C(@NotNull XE0 javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.a = javaTypeEnhancementState;
        this.b = new ConcurrentHashMap<>();
    }

    @NotNull
    public abstract ArrayList a(boolean z, @NotNull Object obj);

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
    @Nullable
    public final C3114cF0 b(@Nullable C3114cF0 c3114cF0, @NotNull InterfaceC2396Xc annotations) {
        boolean z;
        C4838kE0 c4838kE0;
        EnumC2599Zr1 enumC2599Zr1I;
        C4838kE0 c4838kE1;
        Object objC;
        Object next;
        Pair pair;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        XE0 xe0 = this.a;
        if (!xe0.b) {
            ArrayList<C4838kE0> arrayList = new ArrayList();
            Iterator<InterfaceC1583Nc> it = annotations.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC1583Nc next2 = it.next();
                C4838kE0 c4838kE2 = null;
                if (xe0.b || (c4838kE0 = (C4838kE0) C5048lE0.e.get(d(next2))) == null) {
                    c4838kE1 = null;
                } else {
                    C1758Ph0 c1758Ph0D = d(next2);
                    if (c1758Ph0D == null || !C5048lE0.c.containsKey(c1758Ph0D)) {
                        enumC2599Zr1I = i(next2);
                        if (enumC2599Zr1I == null) {
                            enumC2599Zr1I = xe0.a.a;
                        }
                    } else {
                        enumC2599Zr1I = (EnumC2599Zr1) XE0.a.m.invoke(c1758Ph0D);
                    }
                    if (enumC2599Zr1I == EnumC2599Zr1.IGNORE) {
                        enumC2599Zr1I = null;
                    }
                    if (enumC2599Zr1I == null) {
                        c4838kE1 = null;
                    } else {
                        C5448n71 nullabilityQualifier = C5448n71.a(c4838kE0.a, null, enumC2599Zr1I == EnumC2599Zr1.WARN, 1);
                        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
                        Collection<EnumC1976Sc> qualifierApplicabilityTypes = c4838kE0.b;
                        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
                        c4838kE1 = new C4838kE0(nullabilityQualifier, qualifierApplicabilityTypes, c4838kE0.c);
                    }
                }
                if (c4838kE1 != null) {
                    c4838kE2 = c4838kE1;
                } else {
                    if (xe0.a.d || (objC = c(next2, C3542eI0.f)) == null) {
                        pair = null;
                    } else {
                        Iterator it2 = f(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (j(next) == null);
                        if (next == null) {
                            pair = null;
                        } else {
                            ArrayList arrayListA = a(true, objC);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                EnumC1976Sc enumC1976Sc = (EnumC1976Sc) c.get((String) it3.next());
                                if (enumC1976Sc != null) {
                                    linkedHashSet.add(enumC1976Sc);
                                }
                            }
                            if (linkedHashSet.contains(EnumC1976Sc.TYPE_USE)) {
                                linkedHashSet = C5907pJ1.d(C5907pJ1.c(C1526Mj.H(EnumC1976Sc.values()), EnumC1976Sc.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            pair = new Pair(next, linkedHashSet);
                        }
                    }
                    if (pair != null) {
                        Set set = (Set) pair.e;
                        EnumC2599Zr1 enumC2599Zr1I2 = i(next2);
                        Object extractNullability = pair.d;
                        if (enumC2599Zr1I2 == null && (enumC2599Zr1I2 = i(extractNullability)) == null) {
                            enumC2599Zr1I2 = xe0.a.a;
                        }
                        enumC2599Zr1I2.getClass();
                        EnumC2599Zr1 enumC2599Zr1 = EnumC2599Zr1.IGNORE;
                        if (enumC2599Zr1I2 != enumC2599Zr1) {
                            Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
                            C5448n71 c5448n71H = h(false, extractNullability);
                            if (c5448n71H == null) {
                                Object extractNullability2 = j(extractNullability);
                                if (extractNullability2 != null) {
                                    EnumC2599Zr1 enumC2599Zr1I3 = i(extractNullability);
                                    if (enumC2599Zr1I3 == null) {
                                        enumC2599Zr1I3 = xe0.a.a;
                                    }
                                    enumC2599Zr1I3.getClass();
                                    if (enumC2599Zr1I3 == enumC2599Zr1) {
                                        c5448n71H = null;
                                    } else {
                                        Intrinsics.checkNotNullParameter(extractNullability2, "$this$extractNullability");
                                        C5448n71 c5448n71H2 = h(false, extractNullability2);
                                        if (c5448n71H2 != null) {
                                            c5448n71H = C5448n71.a(c5448n71H2, null, enumC2599Zr1I3 == EnumC2599Zr1.WARN, 1);
                                        } else {
                                            c5448n71H = null;
                                        }
                                    }
                                } else {
                                    c5448n71H = null;
                                }
                            }
                            if (c5448n71H != null) {
                                c4838kE2 = new C4838kE0(C5448n71.a(c5448n71H, null, enumC2599Zr1I2 == EnumC2599Zr1.WARN, 1), set);
                            }
                        }
                    }
                }
                if (c4838kE2 != null) {
                    arrayList.add(c4838kE2);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(EnumC1976Sc.class);
                for (C4838kE0 c4838kE3 : arrayList) {
                    for (EnumC1976Sc enumC1976Sc2 : c4838kE3.b) {
                        enumMap.containsKey(enumC1976Sc2);
                        enumMap.put(enumC1976Sc2, c4838kE3);
                    }
                }
                EnumMap enumMap2 = c3114cF0 != null ? new EnumMap((EnumMap) c3114cF0.a) : new EnumMap(EnumC1976Sc.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    EnumC1976Sc enumC1976Sc3 = (EnumC1976Sc) entry.getKey();
                    C4838kE0 c4838kE4 = (C4838kE0) entry.getValue();
                    if (c4838kE4 != null) {
                        enumMap2.put(enumC1976Sc3, c4838kE4);
                        z = true;
                    }
                }
                if (z) {
                    return new C3114cF0(enumMap2);
                }
            }
        }
        return c3114cF0;
    }

    public final TAnnotation c(TAnnotation tannotation, C1758Ph0 c1758Ph0) {
        for (TAnnotation tannotation2 : f(tannotation)) {
            if (Intrinsics.a(d(tannotation2), c1758Ph0)) {
                return tannotation2;
            }
        }
        return null;
    }

    @Nullable
    public abstract C1758Ph0 d(@NotNull TAnnotation tannotation);

    @NotNull
    public abstract FC e(@NotNull Object obj);

    @NotNull
    public abstract Iterable<TAnnotation> f(@NotNull TAnnotation tannotation);

    public final boolean g(TAnnotation tannotation, C1758Ph0 c1758Ph0) {
        Iterable<TAnnotation> iterableF = f(tannotation);
        if ((iterableF instanceof Collection) && ((Collection) iterableF).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableF.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(d(it.next()), c1758Ph0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r7.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r7.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r7.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        r7 = defpackage.EnumC5238m71.e;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C5448n71 h(boolean r6, java.lang.Object r7) {
        /*
            r5 = this;
            Ph0 r0 = r5.d(r7)
            r1 = 0
            if (r0 != 0) goto L9
            goto L96
        L9:
            XE0 r2 = r5.a
            r2.getClass()
            XE0$a r2 = XE0.a.m
            java.lang.Object r2 = r2.invoke(r0)
            Zr1 r2 = (defpackage.EnumC2599Zr1) r2
            r2.getClass()
            Zr1 r3 = defpackage.EnumC2599Zr1.IGNORE
            if (r2 != r3) goto L1e
            return r1
        L1e:
            java.util.Set<Ph0> r3 = defpackage.C3542eI0.k
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2a
            m71 r7 = defpackage.EnumC5238m71.g
            goto L88
        L2a:
            java.util.Set<Ph0> r3 = defpackage.C3542eI0.l
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L35
            m71 r7 = defpackage.EnumC5238m71.e
            goto L88
        L35:
            java.util.Set<Ph0> r3 = defpackage.C3542eI0.m
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L40
            m71 r7 = defpackage.EnumC5238m71.d
            goto L88
        L40:
            Ph0 r3 = defpackage.C3542eI0.g
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L96
            java.util.ArrayList r7 = r5.a(r4, r7)
            java.lang.Object r7 = kotlin.collections.CollectionsKt.G(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L86
            int r0 = r7.hashCode()
            switch(r0) {
                case 73135176: goto L7a;
                case 74175084: goto L71;
                case 433141802: goto L65;
                case 1933739535: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L96
        L5c:
            java.lang.String r0 = "ALWAYS"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L96
            goto L86
        L65:
            java.lang.String r0 = "UNKNOWN"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L6e
            goto L96
        L6e:
            m71 r7 = defpackage.EnumC5238m71.d
            goto L88
        L71:
            java.lang.String r0 = "NEVER"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L83
            goto L96
        L7a:
            java.lang.String r0 = "MAYBE"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L83
            goto L96
        L83:
            m71 r7 = defpackage.EnumC5238m71.e
            goto L88
        L86:
            m71 r7 = defpackage.EnumC5238m71.g
        L88:
            n71 r0 = new n71
            Zr1 r1 = defpackage.EnumC2599Zr1.WARN
            if (r2 != r1) goto L8f
            goto L91
        L8f:
            if (r6 == 0) goto L92
        L91:
            r4 = 1
        L92:
            r0.<init>(r7, r4)
            return r0
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C.h(boolean, java.lang.Object):n71");
    }

    public final EnumC2599Zr1 i(TAnnotation tannotation) {
        String str;
        XE0 xe0 = this.a;
        C2914bI0 c2914bI0 = xe0.a;
        d(tannotation);
        c2914bI0.c.getClass();
        TAnnotation tannotationC = c(tannotation, C3542eI0.q);
        if (tannotationC == null || (str = (String) CollectionsKt.G(a(false, tannotationC))) == null) {
            return null;
        }
        EnumC2599Zr1 enumC2599Zr1 = xe0.a.b;
        if (enumC2599Zr1 != null) {
            return enumC2599Zr1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC2599Zr1.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC2599Zr1.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return EnumC2599Zr1.WARN;
        }
        return null;
    }

    @Nullable
    public final TAnnotation j(@NotNull TAnnotation annotation) {
        TAnnotation tannotationJ;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (!this.a.a.d) {
            if (CollectionsKt.z(C3542eI0.j, d(annotation)) || g(annotation, C3542eI0.d)) {
                return annotation;
            }
            if (g(annotation, C3542eI0.e)) {
                ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.b;
                FC fcE = e(annotation);
                TAnnotation tannotation = concurrentHashMap.get(fcE);
                if (tannotation != null) {
                    return tannotation;
                }
                Iterator<TAnnotation> it = f(annotation).iterator();
                do {
                    if (!it.hasNext()) {
                        tannotationJ = null;
                        break;
                    }
                    tannotationJ = j(it.next());
                } while (tannotationJ == null);
                if (tannotationJ != null) {
                    TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(fcE, tannotationJ);
                    return tannotationPutIfAbsent == null ? tannotationJ : tannotationPutIfAbsent;
                }
            }
        }
        return null;
    }
}
