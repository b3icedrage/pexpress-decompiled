package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: ba1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
public final class C2969ba1 extends WM.a {
    public static final C2969ba1 a = new C2969ba1();

    /* JADX INFO: renamed from: ba1$a */
    @IgnoreJRERequirement
    public static final class a<T> implements WM<AbstractC1091Gt1, Optional<T>> {
        public final WM<AbstractC1091Gt1, T> a;

        public a(WM<AbstractC1091Gt1, T> wm) {
            this.a = wm;
        }

        @Override // defpackage.WM
        public final Object a(AbstractC1091Gt1 abstractC1091Gt1) {
            return Optional.ofNullable(this.a.a(abstractC1091Gt1));
        }
    }

    @Override // WM.a
    @Nullable
    public final WM<AbstractC1091Gt1, ?> b(Type type, Annotation[] annotationArr, C2263Vt1 c2263Vt1) {
        if (Dc2.f(type) != Optional.class) {
            return null;
        }
        return new a(c2263Vt1.d(Dc2.e(0, (ParameterizedType) type), annotationArr));
    }
}
