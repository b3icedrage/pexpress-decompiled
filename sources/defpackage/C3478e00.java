package defpackage;

import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: e00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3478e00 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C3478e00(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws InvocationTargetException {
        UK0 uk0;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                C3688f00 c3688f00 = (C3688f00) obj;
                C6582sZ c6582sZ = c3688f00.o;
                return CollectionsKt.e0(c6582sZ.a.e.e(c3688f00.p, c6582sZ.b));
            case 1:
                int i = C3545eJ0.h;
                C3545eJ0 c3545eJ0 = (C3545eJ0) obj;
                QC qcZ = c3545eJ0.z();
                C3545eJ0.a aVar = (C3545eJ0.a) c3545eJ0.g.getValue();
                aVar.getClass();
                IJ0<Object> ij0 = AbstractC5906pJ0.a.b[0];
                Object objInvoke = aVar.a.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                C7983zB1 c7983zB1 = (C7983zB1) objInvoke;
                S01 s01 = c7983zB1.a.b;
                boolean z = qcZ.c;
                Class<T> cls = c3545eJ0.e;
                FC fcB = (z && cls.isAnnotationPresent(Metadata.class)) ? c7983zB1.a.b(qcZ) : C7859yd0.a(s01, qcZ);
                if (fcB != null) {
                    return fcB;
                }
                if (cls.isSynthetic()) {
                    return C3545eJ0.y(qcZ, c7983zB1);
                }
                C1627Np1 c1627Np1A = C1627Np1.a.a(cls);
                UK0.a aVar2 = (c1627Np1A == null || (uk0 = c1627Np1A.b) == null) ? null : uk0.a;
                switch (aVar2 == null ? -1 : C3545eJ0.b.a[aVar2.ordinal()]) {
                    case -1:
                    case 6:
                        throw new C3761fL0("Unresolved class: " + cls + " (kind = " + aVar2 + ')');
                    case 0:
                    default:
                        throw new C6489s51();
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return C3545eJ0.y(qcZ, c7983zB1);
                    case 5:
                        throw new C3761fL0("Unknown class: " + cls + " (kind = " + aVar2 + ')');
                }
            case 2:
                return C1627Np1.a.a(((FJ0) obj).e);
            case 3:
                YO0 yo0 = (YO0) obj;
                T01 t01 = yo0.g;
                t01.T0();
                return C5027l8.v((IH) t01.o.getValue(), yo0.h);
            default:
                TD1 td1 = (TD1) obj;
                return (QY0) td1.b.invoke(td1.c);
        }
    }
}
