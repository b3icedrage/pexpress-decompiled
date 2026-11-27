package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class T implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ T(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Type[] lowerBounds;
        switch (this.d) {
            case 0:
                return new C7559xA0(((V) this.e).L0());
            case 1:
                PI0 pi0 = (PI0) this.e;
                Type type = null;
                if (pi0.z()) {
                    Object objN = CollectionsKt.N(pi0.i().b());
                    ParameterizedType parameterizedType = objN instanceof ParameterizedType ? (ParameterizedType) objN : null;
                    if (Intrinsics.a(parameterizedType != null ? parameterizedType.getRawType() : null, JM.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                        Object objA = C1526Mj.A(actualTypeArguments);
                        WildcardType wildcardType = objA instanceof WildcardType ? (WildcardType) objA : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) C1526Mj.q(lowerBounds);
                        }
                    }
                }
                return type == null ? pi0.i().n() : type;
            case 2:
                return new BJ0.a((BJ0) this.e);
            default:
                return C3476e.f((C7180vO0) this.e);
        }
    }
}
