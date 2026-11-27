package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4090gu1 implements InterfaceC3880fu1 {

    @NotNull
    public final ReporterApi a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gu1$a */
    public static final class a {
        public static final /* synthetic */ a[] d;

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        static {
            a[] aVarArr = {new a("CLOSE", 0), new a("GOOGLE_PLAY", 1), new a("CHAT", 2), new a("NO_ACTION", 3)};
            d = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gu1$b[], still in use, count: 1, list:
      (r0v1 gu1$b[]) from 0x001a: INVOKE (r0v1 gu1$b[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:27)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: gu1$b */
    public static final class b {
        /* JADX INFO: Fake field, exist only in values array */
        YES("yes", true),
        /* JADX INFO: Fake field, exist only in values array */
        NO("no", false);


        @NotNull
        public final String d;
        public final boolean e;

        static {
            C1952Ru.i(bVarArr);
        }

        public b(String str, boolean z) {
            super(str, i);
            this.d = str;
            this.e = z;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }
    }

    public C4090gu1(@NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = reporter;
    }

    public static String d(Boolean bool) {
        if (bool == null) {
            b[] bVarArr = b.g;
            return "no";
        }
        for (b bVar : b.values()) {
            if (Boolean.valueOf(bVar.e).equals(bool)) {
                return bVar.d;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.InterfaceC3880fu1
    public final void a(int i, @NotNull String from, @Nullable Boolean bool) {
        String str;
        Intrinsics.checkNotNullParameter(from, "from");
        EnumC5113la enumC5113la = EnumC5113la.RATE_DONE_VALUE;
        Integer numValueOf = Integer.valueOf(i);
        ReporterApi reporterApi = this.a;
        ReporterApi.a.c(reporterApi, enumC5113la, numValueOf);
        ReporterApi.a.c(reporterApi, EnumC5113la.GOOGLE_PLAY_TRANSITION, d(bool));
        ReporterApi.a.c(reporterApi, EnumC5113la.CHAT_TRANSITION, d(bool != null ? Boolean.valueOf(!bool.booleanValue()) : null));
        EnumC5028l80 enumC5028l80 = EnumC5028l80.L0;
        Integer numValueOf2 = Integer.valueOf(i);
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            a[] aVarArr = a.d;
            str = "google_play";
        } else if (Intrinsics.a(bool, Boolean.FALSE)) {
            a[] aVarArr2 = a.d;
            str = "chat";
        } else {
            a[] aVarArr3 = a.d;
            str = "no_actions";
        }
        ReporterApi.a.b(reporterApi, enumC5028l80, new C7686xm1(from, str, numValueOf2), null, 12);
    }

    @Override // defpackage.InterfaceC3880fu1
    public final void b(@NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        ReporterApi.a.b(this.a, EnumC5028l80.J0, new C1510Md1(from), null, 12);
    }

    @Override // defpackage.InterfaceC3880fu1
    public final void c(@Nullable Integer num, @NotNull String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        EnumC5028l80 enumC5028l80 = EnumC5028l80.K0;
        C7265vm1 c7265vm1 = new C7265vm1(num);
        ReporterApi reporterApi = this.a;
        ReporterApi.a.b(reporterApi, enumC5028l80, c7265vm1, null, 12);
        if (num != null) {
            EnumC5028l80 enumC5028l81 = EnumC5028l80.L0;
            a[] aVarArr = a.d;
            ReporterApi.a.b(reporterApi, enumC5028l81, new C7686xm1(from, "close", num), null, 12);
        }
    }
}
