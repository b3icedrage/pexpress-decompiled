package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class TL {

    @NonNull
    public final e a;

    public static final class a implements b {

        @NonNull
        public final ContentInfo.Builder a;

        public a(@NonNull ClipData clipData, int i) {
            this.a = QL.a(clipData, i);
        }

        @Override // TL.b
        public final void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // TL.b
        public final void b(int i) {
            this.a.setFlags(i);
        }

        @Override // TL.b
        @NonNull
        public final TL build() {
            return new TL(new d(this.a.build()));
        }

        @Override // TL.b
        public final void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    public interface b {
        void a(Uri uri);

        void b(int i);

        @NonNull
        TL build();

        void setExtras(Bundle bundle);
    }

    public static final class c implements b {

        @NonNull
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        @Override // TL.b
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // TL.b
        public final void b(int i) {
            this.c = i;
        }

        @Override // TL.b
        @NonNull
        public final TL build() {
            return new TL(new f(this));
        }

        @Override // TL.b
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    public static final class d implements e {

        @NonNull
        public final ContentInfo a;

        public d(@NonNull ContentInfo contentInfo) {
            contentInfo.getClass();
            this.a = NL.a(contentInfo);
        }

        @Override // TL.e
        @NonNull
        public final ClipData a() {
            return this.a.getClip();
        }

        @Override // TL.e
        public final int b() {
            return this.a.getFlags();
        }

        @Override // TL.e
        @NonNull
        public final ContentInfo c() {
            return this.a;
        }

        @Override // TL.e
        public final int i() {
            return this.a.getSource();
        }

        @NonNull
        public final String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    public interface e {
        @NonNull
        ClipData a();

        int b();

        ContentInfo c();

        int i();
    }

    public static final class f implements e {

        @NonNull
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public f(c cVar) {
            ClipData clipData = cVar.a;
            clipData.getClass();
            this.a = clipData;
            int i = cVar.b;
            if (i < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
            }
            if (i > 5) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
            }
            this.b = i;
            int i2 = cVar.c;
            if ((i2 & 1) == i2) {
                this.c = i2;
                this.d = cVar.d;
                this.e = cVar.e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // TL.e
        @NonNull
        public final ClipData a() {
            return this.a;
        }

        @Override // TL.e
        public final int b() {
            return this.c;
        }

        @Override // TL.e
        public final ContentInfo c() {
            return null;
        }

        @Override // TL.e
        public final int i() {
            return this.b;
        }

        @NonNull
        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            int i = this.b;
            if (i == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i != 4) {
                strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb.append(strValueOf);
            sb.append(", flags=");
            int i2 = this.c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return C5807oq.b(sb, this.e != null ? ", hasExtras" : "", "}");
        }
    }

    public TL(@NonNull e eVar) {
        this.a = eVar;
    }

    @NonNull
    public final String toString() {
        return this.a.toString();
    }
}
