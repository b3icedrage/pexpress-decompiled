package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Ja2<Data> implements I01<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final Object a;

    public static final class a implements J01<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // Ja2.c
        public final InterfaceC6771tS<AssetFileDescriptor> a(Uri uri) {
            return new C2075Tj(this.a, uri);
        }

        @Override // defpackage.J01
        public final I01<Uri, AssetFileDescriptor> d(J11 j11) {
            return new Ja2(this);
        }
    }

    public static class b implements J01<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // Ja2.c
        public final InterfaceC6771tS<ParcelFileDescriptor> a(Uri uri) {
            return new C1584Nc0(this.a, uri);
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, ParcelFileDescriptor> d(J11 j11) {
            return new Ja2(this);
        }
    }

    public interface c<Data> {
        InterfaceC6771tS<Data> a(Uri uri);
    }

    public static class d implements J01<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // Ja2.c
        public final InterfaceC6771tS<InputStream> a(Uri uri) {
            return new ZR1(this.a, uri);
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, InputStream> d(J11 j11) {
            return new Ja2(this);
        }
    }

    public Ja2(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Ja2$c, java.lang.Object] */
    @Override // defpackage.I01
    public final I01.a b(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Uri uri2 = uri;
        return new I01.a(new M71(uri2), this.a.a(uri2));
    }
}
