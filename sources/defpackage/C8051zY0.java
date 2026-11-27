package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: zY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8051zY0 implements I01<Uri, File> {
    public final Context a;

    /* JADX INFO: renamed from: zY0$a */
    public static final class a implements J01<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, File> d(J11 j11) {
            return new C8051zY0(this.a);
        }
    }

    public C8051zY0(Context context) {
        this.a = context;
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Uri uri) {
        return Nm2.g(uri);
    }

    @Override // defpackage.I01
    public final I01.a<File> b(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Uri uri2 = uri;
        return new I01.a<>(new M71(uri2), new b(this.a, uri2));
    }

    /* JADX INFO: renamed from: zY0$b */
    public static class b implements InterfaceC6771tS<File> {
        public static final String[] g = {"_data"};
        public final Context d;
        public final Uri e;

        public b(Context context, Uri uri) {
            this.d = context;
            this.e = uri;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<File> a() {
            return File.class;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super File> aVar) {
            Cursor cursorQuery = this.d.getContentResolver().query(this.e, g, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.d(new FileNotFoundException("Failed to find file path for: " + this.e));
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final CS e() {
            return CS.d;
        }

        @Override // defpackage.InterfaceC6771tS
        public final void b() {
        }

        @Override // defpackage.InterfaceC6771tS
        public final void cancel() {
        }
    }
}
