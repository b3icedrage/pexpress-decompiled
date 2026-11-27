package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Eh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0898Eh0 extends AbstractC5395ms1 {

    @NotNull
    public static final CY0 c;

    @NotNull
    public final List<String> a;

    @NotNull
    public final List<String> b;

    /* JADX INFO: renamed from: Eh0$a */
    public static final class a {

        @NotNull
        public final ArrayList a = new ArrayList();

        @NotNull
        public final ArrayList b = new ArrayList();
    }

    static {
        Pattern pattern = CY0.d;
        c = CY0.a.a("application/x-www-form-urlencoded");
    }

    public C0898Eh0(@NotNull ArrayList encodedNames, @NotNull ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.a = C6806tc2.y(encodedNames);
        this.b = C6806tc2.y(encodedValues);
    }

    @Override // defpackage.AbstractC5395ms1
    public final long a() {
        return d(null, true);
    }

    @Override // defpackage.AbstractC5395ms1
    @NotNull
    public final CY0 b() {
        return c;
    }

    @Override // defpackage.AbstractC5395ms1
    public final void c(@NotNull InterfaceC2606Zu sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        d(sink, false);
    }

    public final long d(InterfaceC2606Zu interfaceC2606Zu, boolean z) throws EOFException {
        C1481Lu c1481LuN;
        if (z) {
            c1481LuN = new C1481Lu();
        } else {
            Intrinsics.checkNotNull(interfaceC2606Zu);
            c1481LuN = interfaceC2606Zu.n();
        }
        List<String> list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c1481LuN.j1(38);
            }
            c1481LuN.w1(list.get(i));
            c1481LuN.j1(61);
            c1481LuN.w1(this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c1481LuN.e;
        c1481LuN.g();
        return j;
    }
}
