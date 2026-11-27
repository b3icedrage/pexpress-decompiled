package defpackage;

import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7291vv implements Function0 {
    public static final C7291vv d = new C7291vv();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC7502wv.a aVar = InterfaceC7502wv.a.a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC7502wv.class, InterfaceC7502wv.class.getClassLoader());
        Intrinsics.checkNotNull(serviceLoaderLoad);
        InterfaceC7502wv interfaceC7502wv = (InterfaceC7502wv) CollectionsKt.G(serviceLoaderLoad);
        if (interfaceC7502wv != null) {
            return interfaceC7502wv;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
