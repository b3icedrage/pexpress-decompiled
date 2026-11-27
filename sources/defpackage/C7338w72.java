package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class C7338w72 extends C2784ak0 implements Function1<Class<?>, Class<?>> {
    public static final C7338w72 m = new C7338w72();

    public C7338w72() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Class<?> invoke(Class<?> cls) {
        Class<?> p0 = cls;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getComponentType();
    }
}
