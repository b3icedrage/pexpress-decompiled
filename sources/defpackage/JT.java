package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class JT {

    @NotNull
    public static final HT a;

    public /* synthetic */ class a extends C3068c21 {
        public static final a l = new a(HT.class, "timeZoneId", "getTimeZoneId()Ljava/lang/String;");

        @Override // defpackage.C3068c21, defpackage.LJ0
        @Nullable
        public final Object get(@Nullable Object obj) {
            return ((HT) obj).d;
        }

        @Override // defpackage.C3068c21, defpackage.AJ0
        public final void p(@Nullable Object obj, @Nullable Object obj2) {
            ((HT) obj).d = (String) obj2;
        }
    }

    static {
        a aVar = a.l;
        C6833tj1 accessor = new C6833tj1(aVar);
        String name = aVar.getName();
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        Intrinsics.checkNotNullParameter(name, "name");
        a = new HT(0);
    }
}
