package defpackage;

import J.a;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J<A, S extends a<? extends A>> implements InterfaceC1898Rc<A> {

    @NotNull
    public final C1705Op1 a;

    public static abstract class a<A> {
    }

    public static final class b {
        /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:53:0x00df  */
        /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:57:0x00f3 A[RETURN] */
        @Nullable
        public static InterfaceC2699aL0 a(@NotNull AbstractC6208qk1 container, boolean z, boolean z2, @Nullable Boolean bool, boolean z3, @NotNull C1705Op1 kotlinClassFinder, @NotNull C7793yI0 jvmMetadataVersion) {
            VN1 vn1;
            BI0 bi0;
            InterfaceC2699aL0 interfaceC2699aL0;
            AbstractC6208qk1.a aVar;
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
            C2077Tj1.c cVar = C2077Tj1.c.INTERFACE;
            if (z) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
                }
                if (container instanceof AbstractC6208qk1.a) {
                    AbstractC6208qk1.a aVar2 = (AbstractC6208qk1.a) container;
                    if (aVar2.g == cVar) {
                        C5638o21 c5638o21K = C5638o21.k("DefaultImpls");
                        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                        return TK0.a(kotlinClassFinder, aVar2.f.d(c5638o21K), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof AbstractC6208qk1.b)) {
                    VN1 vn2 = container.c;
                    BI0 bi1 = vn2 instanceof BI0 ? (BI0) vn2 : null;
                    C6952uI0 c6952uI0 = bi1 != null ? bi1.c : null;
                    if (c6952uI0 != null) {
                        String strD = c6952uI0.d();
                        Intrinsics.checkNotNullExpressionValue(strD, "getInternalName(...)");
                        C1758Ph0 topLevelFqName = new C1758Ph0(d.l(strD, '/', JwtParser.SEPARATOR_CHAR));
                        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                        C1758Ph0 c1758Ph0E = topLevelFqName.e();
                        return TK0.a(kotlinClassFinder, new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")), jvmMetadataVersion);
                    }
                }
            }
            if (z2 && (container instanceof AbstractC6208qk1.a)) {
                AbstractC6208qk1.a aVar3 = (AbstractC6208qk1.a) container;
                if (aVar3.g == C2077Tj1.c.COMPANION_OBJECT && (aVar = aVar3.e) != null) {
                    C2077Tj1.c cVar2 = C2077Tj1.c.CLASS;
                    C2077Tj1.c cVar3 = aVar.g;
                    if (cVar3 == cVar2 || cVar3 == C2077Tj1.c.ENUM_CLASS || (z3 && (cVar3 == cVar || cVar3 == C2077Tj1.c.ANNOTATION_CLASS))) {
                        VN1 vn3 = aVar.c;
                        C3132cL0 c3132cL0 = vn3 instanceof C3132cL0 ? (C3132cL0) vn3 : null;
                        if (c3132cL0 != null) {
                            return c3132cL0.b;
                        }
                    } else if (container instanceof AbstractC6208qk1.b) {
                        vn1 = container.c;
                        if (vn1 instanceof BI0) {
                            Intrinsics.c(vn1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                            bi0 = (BI0) vn1;
                            interfaceC2699aL0 = bi0.d;
                            if (interfaceC2699aL0 == null) {
                                return TK0.a(kotlinClassFinder, bi0.c(), jvmMetadataVersion);
                            }
                            return interfaceC2699aL0;
                        }
                    }
                } else if (container instanceof AbstractC6208qk1.b) {
                    vn1 = container.c;
                    if (vn1 instanceof BI0) {
                        Intrinsics.c(vn1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                        bi0 = (BI0) vn1;
                        interfaceC2699aL0 = bi0.d;
                        if (interfaceC2699aL0 == null) {
                            return TK0.a(kotlinClassFinder, bi0.c(), jvmMetadataVersion);
                        }
                        return interfaceC2699aL0;
                    }
                }
            } else if (container instanceof AbstractC6208qk1.b) {
                vn1 = container.c;
                if (vn1 instanceof BI0) {
                    Intrinsics.c(vn1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                    bi0 = (BI0) vn1;
                    interfaceC2699aL0 = bi0.d;
                    if (interfaceC2699aL0 == null) {
                        return TK0.a(kotlinClassFinder, bi0.c(), jvmMetadataVersion);
                    }
                    return interfaceC2699aL0;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c d;
        public static final c e;
        public static final c g;
        public static final /* synthetic */ c[] h;

        static {
            c cVar = new c("PROPERTY", 0);
            d = cVar;
            c cVar2 = new c("BACKING_FIELD", 1);
            e = cVar2;
            c cVar3 = new c("DELEGATE_FIELD", 2);
            g = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            h = cVarArr;
            C1952Ru.i(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) h.clone();
        }
    }

    public J(@NotNull C1705Op1 kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.a = kotlinClassFinder;
    }

    public static /* synthetic */ List m(J j, AbstractC6208qk1 abstractC6208qk1, TY0 ty0, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return j.l(abstractC6208qk1, ty0, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    @Nullable
    public static TY0 n(@NotNull AbstractC0673Bk0.c proto, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable, @NotNull EnumC0804Dc kind, boolean z) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (proto instanceof C2155Uj1) {
            C1578Na0 c1578Na0 = GI0.a;
            AbstractC7583xI0.b bVarA = GI0.a((C2155Uj1) proto, nameResolver, typeTable);
            if (bVarA != null) {
                return TY0.a.a(bVarA);
            }
        } else if (proto instanceof C2575Zj1) {
            C1578Na0 c1578Na1 = GI0.a;
            AbstractC7583xI0.b bVarC = GI0.c((C2575Zj1) proto, nameResolver, typeTable);
            if (bVarC != null) {
                return TY0.a.a(bVarC);
            }
        } else if (proto instanceof C3637ek1) {
            AbstractC0673Bk0.e<C3637ek1, FI0.c> propertySignature = FI0.d;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            FI0.c cVar = (FI0.c) C5998pk1.a(proto, propertySignature);
            if (cVar != null) {
                int iOrdinal = kind.ordinal();
                if (iOrdinal == 1) {
                    return L.a((C3637ek1) proto, nameResolver, typeTable, true, true, z);
                }
                if (iOrdinal == 2) {
                    if ((cVar.e & 4) != 4) {
                        return null;
                    }
                    FI0.b signature = cVar.i;
                    Intrinsics.checkNotNullExpressionValue(signature, "getGetter(...)");
                    Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
                    Intrinsics.checkNotNullParameter(signature, "signature");
                    String name = nameResolver.getString(signature.g);
                    String desc = nameResolver.getString(signature.h);
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(desc, "desc");
                    return new TY0(Z0.c(name, desc));
                }
                if (iOrdinal != 3 || (cVar.e & 8) != 8) {
                    return null;
                }
                FI0.b signature2 = cVar.j;
                Intrinsics.checkNotNullExpressionValue(signature2, "getSetter(...)");
                Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
                Intrinsics.checkNotNullParameter(signature2, "signature");
                String name2 = nameResolver.getString(signature2.g);
                String desc2 = nameResolver.getString(signature2.h);
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(desc2, "desc");
                return new TY0(Z0.c(name2, desc2));
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List<A> b(@NotNull AbstractC6208qk1 container, @NotNull C3637ek1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return r(container, proto, c.g);
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final ArrayList c(@NotNull C4267hk1 proto, @NotNull InterfaceC5848p21 nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object objK = proto.k(FI0.f);
        Intrinsics.checkNotNullExpressionValue(objK, "getExtension(...)");
        Iterable<C1999Sj1> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        for (C1999Sj1 proto2 : iterable) {
            Intrinsics.checkNotNull(proto2);
            Intrinsics.checkNotNullParameter(proto2, "proto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            arrayList.add(((C4760js) this).e.a(proto2, nameResolver));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final ArrayList e(@NotNull C4735jk1 proto, @NotNull InterfaceC5848p21 nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Object objK = proto.k(FI0.h);
        Intrinsics.checkNotNullExpressionValue(objK, "getExtension(...)");
        Iterable<C1999Sj1> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(XE.m(iterable, 10));
        for (C1999Sj1 proto2 : iterable) {
            Intrinsics.checkNotNull(proto2);
            Intrinsics.checkNotNullParameter(proto2, "proto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            arrayList.add(((C4760js) this).e.a(proto2, nameResolver));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List<A> f(@NotNull AbstractC6208qk1 container, @NotNull C2419Xj1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        String name = container.a.getString(proto.h);
        String desc = UC.b(((AbstractC6208qk1.a) container).f.b());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return m(this, container, new TY0(name + '#' + desc), null, false, 60);
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List<A> g(@NotNull AbstractC6208qk1 container, @NotNull C3637ek1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        return r(container, proto, c.e);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List h(@NotNull AbstractC6208qk1 container, @NotNull AbstractC0673Bk0.c callableProto, @NotNull EnumC0804Dc kind, int i, @NotNull C5155lk1 proto) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(callableProto, "callableProto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        int i2 = 0;
        TY0 signature = n(callableProto, container.a, container.b, kind, false);
        if (signature == null) {
            return C5653o60.d;
        }
        if (callableProto instanceof C2575Zj1) {
            C2575Zj1 c2575Zj1 = (C2575Zj1) callableProto;
            Intrinsics.checkNotNullParameter(c2575Zj1, "<this>");
            int i3 = c2575Zj1.g;
            if ((i3 & 32) == 32 || (i3 & 64) == 64) {
                i2 = 1;
            }
        } else if (callableProto instanceof C3637ek1) {
            C3637ek1 c3637ek1 = (C3637ek1) callableProto;
            Intrinsics.checkNotNullParameter(c3637ek1, "<this>");
            int i4 = c3637ek1.g;
            if ((i4 & 32) == 32 || (i4 & 64) == 64) {
                i2 = 1;
            }
        } else {
            if (!(callableProto instanceof C2155Uj1)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            AbstractC6208qk1.a aVar = (AbstractC6208qk1.a) container;
            if (aVar.g == C2077Tj1.c.ENUM_CLASS) {
                i2 = 2;
            } else if (aVar.h) {
                i2 = 1;
            }
        }
        Intrinsics.checkNotNullParameter(signature, "signature");
        return m(this, container, new TY0(signature.a + '@' + (i + i2)), null, false, 60);
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List i(@NotNull AbstractC6208qk1 container, @NotNull AbstractC0673Bk0.c proto, @NotNull EnumC0804Dc kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        TY0 signature = n(proto, container.a, container.b, kind, false);
        if (signature == null) {
            return C5653o60.d;
        }
        Intrinsics.checkNotNullParameter(signature, "signature");
        return m(this, container, new TY0(C5807oq.b(new StringBuilder(), signature.a, "@0")), null, false, 60);
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final List j(@NotNull AbstractC6208qk1 container, @NotNull AbstractC0673Bk0.c proto, @NotNull EnumC0804Dc kind) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind == EnumC0804Dc.e) {
            return r(container, (C3637ek1) proto, c.d);
        }
        TY0 ty0N = n(proto, container.a, container.b, kind, false);
        return ty0N == null ? C5653o60.d : m(this, container, ty0N, null, false, 60);
    }

    @Override // defpackage.InterfaceC1898Rc
    @NotNull
    public final ArrayList k(@NotNull AbstractC6208qk1.a container) {
        Intrinsics.checkNotNullParameter(container, "container");
        VN1 vn1 = container.c;
        C3132cL0 c3132cL0 = vn1 instanceof C3132cL0 ? (C3132cL0) vn1 : null;
        InterfaceC2699aL0 kotlinClass = c3132cL0 != null ? c3132cL0.b : null;
        if (kotlinClass == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + container.f.a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        K k = new K(this, arrayList);
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        kotlinClass.c(k);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public final List<A> l(AbstractC6208qk1 container, TY0 ty0, boolean z, boolean z2, Boolean bool, boolean z3) {
        InterfaceC2699aL0 binaryClass = b.a(container, z, z2, bool, z3, this.a, ((C4760js) this).f);
        Intrinsics.checkNotNullParameter(container, "container");
        if (binaryClass == null) {
            if (container instanceof AbstractC6208qk1.a) {
                VN1 vn1 = ((AbstractC6208qk1.a) container).c;
                C3132cL0 c3132cL0 = vn1 instanceof C3132cL0 ? (C3132cL0) vn1 : null;
                if (c3132cL0 != null) {
                    binaryClass = c3132cL0.b;
                } else {
                    binaryClass = null;
                }
            } else {
                binaryClass = null;
            }
        }
        if (binaryClass == null) {
            return C5653o60.d;
        }
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        List<A> list = (List) ((C2474Yc) ((C2720aS0.k) ((I) this).b).invoke(binaryClass)).a.get(ty0);
        return list == null ? C5653o60.d : list;
    }

    public final boolean o(@NotNull QC classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.e() == null || !Intrinsics.a(classId.f().e(), "Container")) {
            return false;
        }
        InterfaceC2699aL0 klass = TK0.a(this.a, classId, ((C4760js) this).f);
        if (klass == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = C6551sO1.a;
        Intrinsics.checkNotNullParameter(klass, "klass");
        C2512Yo1 c2512Yo1 = new C2512Yo1();
        ((C1627Np1) klass).c(new C6341rO1(c2512Yo1));
        return c2512Yo1.d;
    }

    @Nullable
    public abstract C4970ks p(@NotNull QC qc, @NotNull VN1 vn1, @NotNull List list);

    @Nullable
    public final C4970ks q(@NotNull QC annotationClassId, @NotNull C4285hp1 source, @NotNull List result) {
        Intrinsics.checkNotNullParameter(annotationClassId, "annotationClassId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(result, "result");
        if (C6551sO1.a.contains(annotationClassId)) {
            return null;
        }
        return p(annotationClassId, source, result);
    }

    public final List<A> r(AbstractC6208qk1 abstractC6208qk1, C3637ek1 c3637ek1, c cVar) {
        Boolean boolC = C2061Te0.B.c(c3637ek1.h);
        Intrinsics.checkNotNullExpressionValue(boolC, "get(...)");
        boolean zD = GI0.d(c3637ek1);
        c cVar2 = c.d;
        C2656a72 c2656a72 = abstractC6208qk1.b;
        InterfaceC5848p21 interfaceC5848p21 = abstractC6208qk1.a;
        if (cVar == cVar2) {
            TY0 ty0A = L.a(c3637ek1, interfaceC5848p21, c2656a72, (40 & 8) == 0, (40 & 16) == 0, true);
            return ty0A == null ? C5653o60.d : m(this, abstractC6208qk1, ty0A, boolC, zD, 8);
        }
        TY0 ty0A2 = L.a(c3637ek1, interfaceC5848p21, c2656a72, (40 & 8) == 0, (40 & 16) == 0, true);
        if (ty0A2 == null) {
            return C5653o60.d;
        }
        return StringsKt.C(ty0A2.a, "$delegate", false) != (cVar == c.g) ? C5653o60.d : l(abstractC6208qk1, ty0A2, true, true, boolC, zD);
    }
}
