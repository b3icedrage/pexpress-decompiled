package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: nS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5514nS1<Data> implements I01<String, Data> {
    public final I01<Uri, Data> a;

    /* JADX INFO: renamed from: nS1$a */
    public static final class a implements J01<String, AssetFileDescriptor> {
        @Override // defpackage.J01
        public final I01<String, AssetFileDescriptor> d(@NonNull J11 j11) {
            return new C5514nS1(j11.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: nS1$b */
    public static class b implements J01<String, ParcelFileDescriptor> {
        @Override // defpackage.J01
        @NonNull
        public final I01<String, ParcelFileDescriptor> d(@NonNull J11 j11) {
            return new C5514nS1(j11.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* JADX INFO: renamed from: nS1$c */
    public static class c implements J01<String, InputStream> {
        @Override // defpackage.J01
        @NonNull
        public final I01<String, InputStream> d(@NonNull J11 j11) {
            return new C5514nS1(j11.a(Uri.class, InputStream.class));
        }
    }

    public C5514nS1(I01<Uri, Data> i01) {
        this.a = i01;
    }

    @Override // defpackage.I01
    public final /* bridge */ /* synthetic */ boolean a(@NonNull String str) {
        return true;
    }

    @Override // defpackage.I01
    public final I01.a b(@NonNull String str, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile != null) {
            I01<Uri, Data> i01 = this.a;
            if (i01.a(uriFromFile)) {
                return i01.b(uriFromFile, i, i2, c4227ha1);
            }
        }
        return null;
    }
}
