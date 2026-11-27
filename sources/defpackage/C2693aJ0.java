package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: aJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2693aJ0 implements Function0 {
    public final C3545eJ0 d;
    public final C3545eJ0.a e;

    public C2693aJ0(C3545eJ0.a aVar, C3545eJ0 c3545eJ0) {
        this.d = c3545eJ0;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C3545eJ0 c3545eJ0 = this.d;
        if (c3545eJ0.e.isAnonymousClass()) {
            return null;
        }
        QC qcZ = c3545eJ0.z();
        if (!qcZ.c) {
            String strE = qcZ.f().e();
            Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
            return strE;
        }
        this.e.getClass();
        Class<T> cls = c3545eJ0.e;
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            Intrinsics.checkNotNull(simpleName);
            return StringsKt.V(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            Intrinsics.checkNotNull(simpleName);
            return StringsKt.U('$', simpleName, simpleName);
        }
        Intrinsics.checkNotNull(simpleName);
        return StringsKt.V(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }
}
