package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.sequences.Sequence;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7128v72 {

    /* JADX INFO: renamed from: v72$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2920bK0.values().length];
            try {
                EnumC2920bK0 enumC2920bK0 = EnumC2920bK0.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC2920bK0 enumC2920bK1 = EnumC2920bK0.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC2920bK0 enumC2920bK2 = EnumC2920bK0.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        Sequence sequenceE = FH1.e(type, C7338w72.m);
        return ((Class) JH1.l(sequenceE)).getName() + d.k(JH1.f(sequenceE), "[]");
    }

    public static final Type b(SJ0 sj0, boolean z) {
        InterfaceC4853kJ0 interfaceC4853kJ0G = sj0.g();
        if (interfaceC4853kJ0G instanceof XJ0) {
            return new C3299d72((XJ0) interfaceC4853kJ0G);
        }
        if (!(interfaceC4853kJ0G instanceof RI0)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + sj0);
        }
        RI0 ri0 = (RI0) interfaceC4853kJ0G;
        Class clsH = z ? C7279vr.h(ri0) : C7279vr.g(ri0);
        List<KTypeProjection> listF = sj0.f();
        if (listF.isEmpty()) {
            return clsH;
        }
        if (!clsH.isArray()) {
            return c(clsH, listF);
        }
        if (clsH.getComponentType().isPrimitive()) {
            return clsH;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.W(listF);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + sj0);
        }
        EnumC2920bK0 enumC2920bK0 = kTypeProjection.a;
        int i = enumC2920bK0 == null ? -1 : a.a[enumC2920bK0.ordinal()];
        if (i == -1 || i == 1) {
            return clsH;
        }
        if (i != 2 && i != 3) {
            throw new C6489s51();
        }
        SJ0 sj1 = kTypeProjection.b;
        Intrinsics.checkNotNull(sj1);
        Type typeB = b(sj1, false);
        return typeB instanceof Class ? clsH : new C0985Fk0(typeB);
    }

    public static final C1975Sb1 c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(XE.m(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e((KTypeProjection) it.next()));
            }
            return new C1975Sb1(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(e((KTypeProjection) it2.next()));
            }
            return new C1975Sb1(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C1975Sb1 c1975Sb1C = c(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(XE.m(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(e((KTypeProjection) it3.next()));
        }
        return new C1975Sb1(cls, c1975Sb1C, arrayList3);
    }

    @NotNull
    public static final Type d(@NotNull SJ0 sj0) {
        Type typeB;
        Intrinsics.checkNotNullParameter(sj0, "<this>");
        return (!(sj0 instanceof TJ0) || (typeB = ((TJ0) sj0).b()) == null) ? b(sj0, false) : typeB;
    }

    public static final Type e(KTypeProjection kTypeProjection) {
        EnumC2920bK0 enumC2920bK0 = kTypeProjection.a;
        if (enumC2920bK0 == null) {
            Gi2.g.getClass();
            return Gi2.h;
        }
        SJ0 sj0 = kTypeProjection.b;
        Intrinsics.checkNotNull(sj0);
        int iOrdinal = enumC2920bK0.ordinal();
        if (iOrdinal == 0) {
            return b(sj0, true);
        }
        if (iOrdinal == 1) {
            return new Gi2(null, b(sj0, true));
        }
        if (iOrdinal == 2) {
            return new Gi2(b(sj0, true), null);
        }
        throw new C6489s51();
    }
}
