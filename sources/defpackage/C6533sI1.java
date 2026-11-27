package defpackage;

import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sI1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6533sI1 {

    @NotNull
    public final Map<Method, AbstractC5694oI1> a;

    /* JADX INFO: renamed from: sI1$a */
    public static final class a {
        public final AB1 a;
        public final AbstractC5694oI1.c.a b;
        public final AbstractC5694oI1.b.a c;

        public a(@NotNull AB1 runtimePlatform, @NotNull AbstractC5694oI1.c.a sendServiceMethodFactory, @NotNull AbstractC5694oI1.b.a receiveServiceMethodFactory) {
            Intrinsics.checkNotNullParameter(runtimePlatform, "runtimePlatform");
            Intrinsics.checkNotNullParameter(sendServiceMethodFactory, "sendServiceMethodFactory");
            Intrinsics.checkNotNullParameter(receiveServiceMethodFactory, "receiveServiceMethodFactory");
            this.a = runtimePlatform;
            this.b = sendServiceMethodFactory;
            this.c = receiveServiceMethodFactory;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6533sI1(@NotNull Map<Method, ? extends AbstractC5694oI1> serviceMethods) {
        Intrinsics.checkNotNullParameter(serviceMethods, "serviceMethods");
        this.a = serviceMethods;
    }
}
