package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5962pb1 {

    @NotNull
    public static final a a = a.a;

    /* JADX INFO: renamed from: pb1$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        @NotNull
        public static final Q01<InterfaceC5962pb1> b = new Q01<>("PackageViewDescriptorFactory");
    }

    /* JADX INFO: renamed from: pb1$b */
    public static final class b implements InterfaceC5962pb1 {

        @NotNull
        public static final b b = new b();

        @Override // defpackage.InterfaceC5962pb1
        @NotNull
        public final YO0 a(@NotNull T01 module, @NotNull C1758Ph0 fqName, @NotNull C2720aS0 storageManager) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            return new YO0(module, fqName, storageManager);
        }
    }

    @NotNull
    YO0 a(@NotNull T01 t01, @NotNull C1758Ph0 c1758Ph0, @NotNull C2720aS0 c2720aS0);
}
