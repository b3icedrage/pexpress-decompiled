package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: Fx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1024Fx0 extends M {
    public final C0946Ex0 a = new C0946Ex0();
    public final ArrayList b = new ArrayList();

    /* JADX INFO: renamed from: Fx0$a */
    public static class a extends N {
        @Override // defpackage.InterfaceC2102Ts
        public final C3037bt a(N20 n20, N20.a aVar) {
            if (n20.g < 4 || n20.h || (n20.h().f() instanceof C1349Kb1)) {
                return null;
            }
            C3037bt c3037bt = new C3037bt(new C1024Fx0());
            c3037bt.c = n20.c + 4;
            return c3037bt;
        }
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void b() {
        int i;
        ArrayList arrayList = this.b;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                CharSequence charSequence = (CharSequence) arrayList.get(size);
                int length = charSequence.length();
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = charSequence.charAt(i2);
                        if (cCharAt != ' ') {
                            switch (cCharAt) {
                                case '\t':
                                case '\n':
                                case 11:
                                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                case '\r':
                                    break;
                            }
                        }
                        i2++;
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 == -1) {
                    size--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb.append((CharSequence) arrayList.get(i));
            sb.append('\n');
        }
        this.a.f = sb.toString();
    }

    @Override // defpackage.InterfaceC2024Ss
    public final C1946Rs c(N20 n20) {
        if (n20.g >= 4) {
            return new C1946Rs(-1, false, n20.c + 4);
        }
        if (n20.h) {
            return C1946Rs.a(n20.e);
        }
        return null;
    }

    @Override // defpackage.InterfaceC2024Ss
    public final AbstractC1634Ns f() {
        return this.a;
    }

    @Override // defpackage.M, defpackage.InterfaceC2024Ss
    public final void h(CharSequence charSequence) {
        this.b.add(charSequence);
    }
}
