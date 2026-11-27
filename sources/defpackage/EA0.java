package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class EA0 {
    public final c a;

    public interface c {
        @NonNull
        Uri a();

        void b();

        Uri c();

        Object d();

        @NonNull
        ClipDescription getDescription();
    }

    public EA0(@NonNull Uri uri, @NonNull ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static final class a implements c {

        @NonNull
        public final InputContentInfo a;

        public a(@NonNull Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // EA0.c
        @NonNull
        public final Uri a() {
            return this.a.getContentUri();
        }

        @Override // EA0.c
        public final void b() {
            this.a.requestPermission();
        }

        @Override // EA0.c
        public final Uri c() {
            return this.a.getLinkUri();
        }

        @Override // EA0.c
        @NonNull
        public final Object d() {
            return this.a;
        }

        @Override // EA0.c
        @NonNull
        public final ClipDescription getDescription() {
            return this.a.getDescription();
        }

        public a(@NonNull Uri uri, @NonNull ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public EA0(@NonNull a aVar) {
        this.a = aVar;
    }

    public static final class b implements c {

        @NonNull
        public final Uri a;

        @NonNull
        public final ClipDescription b;
        public final Uri c;

        public b(@NonNull Uri uri, @NonNull ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // EA0.c
        @NonNull
        public final Uri a() {
            return this.a;
        }

        @Override // EA0.c
        public final Uri c() {
            return this.c;
        }

        @Override // EA0.c
        public final Object d() {
            return null;
        }

        @Override // EA0.c
        @NonNull
        public final ClipDescription getDescription() {
            return this.b;
        }

        @Override // EA0.c
        public final void b() {
        }
    }
}
