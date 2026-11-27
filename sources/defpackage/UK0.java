package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UK0 {

    @NotNull
    public final a a;

    @NotNull
    public final C7793yI0 b;

    @Nullable
    public final String[] c;

    @Nullable
    public final String[] d;

    @Nullable
    public final String[] e;

    @Nullable
    public final String f;
    public final int g;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 UK0$a[], still in use, count: 1, list:
      (r0v1 UK0$a[]) from 0x0042: INVOKE (r0v1 UK0$a[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m)] (LINE:67)
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
    public static final class a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        @NotNull
        public static final C0154a e;

        @NotNull
        public static final LinkedHashMap g;
        public final int d;

        /* JADX INFO: renamed from: UK0$a$a, reason: collision with other inner class name */
        public static final class C0154a {
        }

        static {
            C1952Ru.i(new a[]{r0, r1, r2, r3, r4, r5});
            e = new C0154a();
            a[] aVarArrValues = values();
            int iA = OW0.a(aVarArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (a aVar : aVarArrValues) {
                linkedHashMap.put(Integer.valueOf(aVar.d), aVar);
            }
            g = linkedHashMap;
        }

        public a(int i) {
            super(str, i);
            this.d = i;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) n.clone();
        }
    }

    public UK0(@NotNull a kind, @NotNull C7793yI0 metadataVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.a = kind;
        this.b = metadataVersion;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str;
        this.g = i;
    }

    @NotNull
    public final String toString() {
        return this.a + " version=" + this.b;
    }
}
