package defpackage;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public abstract class DE {

    public static final class a extends DE {
        public int a;
        public int b;
        public final int c;
        public final int d;
        public int e = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.a = i2 + i;
            this.c = i;
            this.d = i;
        }

        public final int a(int i) throws C6934uC0 {
            if (i < 0) {
                throw new C6934uC0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i2 = (this.c - this.d) + i;
            if (i2 < 0) {
                throw C6934uC0.b();
            }
            int i3 = this.e;
            if (i2 > i3) {
                throw C6934uC0.c();
            }
            this.e = i2;
            int i4 = this.a + this.b;
            this.a = i4;
            int i5 = i4 - this.d;
            int i6 = this.e;
            if (i5 > i6) {
                int i7 = i5 - i6;
                this.b = i7;
                this.a = i4 - i7;
            } else {
                this.b = 0;
            }
            return i3;
        }
    }
}
