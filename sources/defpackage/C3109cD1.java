package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3109cD1 {
    public final AB1 a;
    public final C5061lI1.a b;

    /* JADX INFO: renamed from: cD1$a */
    public static final class a {

        @Deprecated
        public static final C7411wV g = new C7411wV();

        @Deprecated
        public static final C0957Fb h = new C0957Fb();

        @Deprecated
        public static final AbstractC4836kD1 i;
        public F81.a a;
        public InterfaceC7394wP0 b = g;
        public final C0957Fb c = h;
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public final AB1 f = AB1.a;

        static {
            AbstractC4836kD1 abstractC4836kD1 = C6099qD1.a;
            Intrinsics.checkNotNullExpressionValue(abstractC4836kD1, "Schedulers.computation()");
            i = abstractC4836kD1;
        }
    }

    public C3109cD1(@NotNull AB1 runtimePlatform, @NotNull C5061lI1.a serviceFactory) {
        Intrinsics.checkNotNullParameter(runtimePlatform, "runtimePlatform");
        Intrinsics.checkNotNullParameter(serviceFactory, "serviceFactory");
        this.a = runtimePlatform;
        this.b = serviceFactory;
    }
}
