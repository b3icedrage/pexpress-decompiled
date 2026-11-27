package defpackage;

import com.google.android.gms.common.api.Api;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3319dD1 implements InvocationHandler {
    public final /* synthetic */ C3109cD1 a;
    public final /* synthetic */ C5061lI1 b;

    public C3319dD1(C3109cD1 c3109cD1, C5061lI1 c5061lI1) {
        this.a = c3109cD1;
        this.b = c5061lI1;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] args) {
        if (args == null) {
            args = new Object[0];
        }
        C3109cD1 c3109cD1 = this.a;
        Intrinsics.checkNotNullExpressionValue(method, "method");
        AB1 ab1 = c3109cD1.a;
        if (ab1.b(method)) {
            Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
            return ab1.a(method, proxy, args);
        }
        boolean zA = Intrinsics.a(method.getDeclaringClass(), Object.class);
        C5061lI1 c5061lI1 = this.b;
        if (zA) {
            Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
            if (Intrinsics.a(method.getName(), "equals") && Arrays.equals(new Class[]{Object.class}, method.getParameterTypes())) {
                return Boolean.valueOf(proxy == args[0]);
            }
            if (Intrinsics.a(method.getName(), "toString")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "method.parameterTypes");
                if (parameterTypes.length == 0) {
                    return "Scarlet service implementation for ".concat(InterfaceC5125ld.class.getName());
                }
            }
            if (Intrinsics.a(method.getName(), "hashCode")) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes2, "method.parameterTypes");
                if (parameterTypes2.length == 0) {
                    return Integer.valueOf(c5061lI1.hashCode());
                }
            }
            throw new IllegalStateException("Cannot execute " + method);
        }
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        C6533sI1 c6533sI1 = c5061lI1.a;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        AbstractC5694oI1 abstractC5694oI1 = c6533sI1.a.get(method);
        if (abstractC5694oI1 == null) {
            throw new IllegalStateException("Service method not found");
        }
        AbstractC5694oI1 abstractC5694oI2 = abstractC5694oI1;
        if (abstractC5694oI2 instanceof AbstractC5694oI1.c) {
            AbstractC5694oI1.c cVar = (AbstractC5694oI1.c) abstractC5694oI2;
            Object data = args[0];
            Intrinsics.checkNotNullParameter(data, "data");
            AbstractC6583sZ0 message = cVar.b.a(data);
            C2695aK c2695aK = cVar.a;
            c2695aK.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            CP1 cp1 = c2695aK.a.c.a.get();
            Intrinsics.b(cp1, "stateRef.get()");
            CP1 cp2 = cp1;
            return Boolean.valueOf(cp2 instanceof CP1.a ? ((CP1.a) cp2).a.a.a(message) : false);
        }
        if (!(abstractC5694oI2 instanceof AbstractC5694oI1.b)) {
            throw new C6489s51();
        }
        AbstractC5694oI1.b bVar = (AbstractC5694oI1.b) abstractC5694oI2;
        CallableC5904pI1 callableC5904pI1 = new CallableC5904pI1(bVar);
        int i = AbstractC7871yg0.d;
        C8081zg0 c8081zg0 = new C8081zg0(callableC5904pI1);
        AbstractC4836kD1 abstractC4836kD1 = bVar.c;
        C1589Ne.r(abstractC4836kD1, "scheduler is null");
        int i2 = AbstractC7871yg0.d;
        C1589Ne.x(i2, "bufferSize");
        C1129Hg0 c1129Hg0 = new C1129Hg0(c8081zg0, abstractC4836kD1, i2);
        YK0 yk0 = new YK0(new C6114qI1(1, bVar.a, D80.class, "mapToData", "mapToData(Lcom/tinder/scarlet/Event;)Lio/reactivex/Maybe;", 0));
        C1589Ne.x(Api.BaseClientBuilder.API_PRIORITY_OTHER, "maxConcurrency");
        C0817Dg0 toStream = new C0817Dg0(c1129Hg0, yk0);
        Intrinsics.checkNotNullExpressionValue(toStream, "Flowable.defer { connect…e(eventMapper::mapToData)");
        Intrinsics.checkNotNullParameter(toStream, "$this$toStream");
        return bVar.d.a(new C1441Lg0(toStream));
    }
}
