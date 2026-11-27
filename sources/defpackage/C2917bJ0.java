package defpackage;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2917bJ0 implements Function0 {
    public final C3545eJ0.a d;
    public final C3545eJ0 e;

    public C2917bJ0(C3545eJ0.a aVar, C3545eJ0 c3545eJ0) {
        this.d = aVar;
        this.e = c3545eJ0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField;
        FC fcB = this.d.b();
        if (fcB.h() != SC.j) {
            return null;
        }
        boolean zE = fcB.E();
        C3545eJ0 c3545eJ0 = this.e;
        if (zE) {
            C7996zG c7996zG = C7996zG.a;
            if (C5207m.j(fcB)) {
                declaredField = c3545eJ0.e.getDeclaredField("INSTANCE");
            } else {
                declaredField = c3545eJ0.e.getEnclosingClass().getDeclaredField(fcB.getName().e());
            }
        } else {
            declaredField = c3545eJ0.e.getDeclaredField("INSTANCE");
        }
        Object obj = declaredField.get(null);
        Intrinsics.c(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
        return obj;
    }
}
