package defpackage;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1490Lx extends InterfaceC1335Jx, GY0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Lx$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final /* synthetic */ a[] i;

        static {
            a aVar = new a("DECLARATION", 0);
            d = aVar;
            a aVar2 = new a("FAKE_OVERRIDE", 1);
            e = aVar2;
            a aVar3 = new a("DELEGATION", 2);
            g = aVar3;
            a aVar4 = new a("SYNTHESIZED", 3);
            h = aVar4;
            i = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) i.clone();
        }
    }

    @NotNull
    InterfaceC1490Lx C(FC fc, C01 c01, QW qw);

    void D0(@NotNull Collection<? extends InterfaceC1490Lx> collection);

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    InterfaceC1490Lx a();

    @NotNull
    a h();

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    Collection<? extends InterfaceC1490Lx> u();
}
