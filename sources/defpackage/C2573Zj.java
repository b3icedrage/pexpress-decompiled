package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: renamed from: Zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2573Zj<Data> implements I01<Uri, Data> {
    public final AssetManager a;
    public final Object b;

    /* JADX INFO: renamed from: Zj$a */
    public interface a<Data> {
        InterfaceC6771tS<Data> a(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: Zj$b */
    public static class b implements J01<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // defpackage.C2573Zj.a
        public final InterfaceC6771tS<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new C1506Mc0(assetManager, str);
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, AssetFileDescriptor> d(J11 j11) {
            return new C2573Zj(this.a, this);
        }
    }

    /* JADX INFO: renamed from: Zj$c */
    public static class c implements J01<Uri, InputStream>, a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // defpackage.C2573Zj.a
        public final InterfaceC6771tS<InputStream> a(AssetManager assetManager, String str) {
            return new WR1(assetManager, str);
        }

        @Override // defpackage.J01
        @NonNull
        public final I01<Uri, InputStream> d(J11 j11) {
            return new C2573Zj(this.a, this);
        }
    }

    public C2573Zj(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Zj$a, java.lang.Object] */
    @Override // defpackage.I01
    public final I01.a b(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Uri uri2 = uri;
        return new I01.a(new M71(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }
}
