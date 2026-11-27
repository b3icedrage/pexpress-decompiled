package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: p72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5869p72 {

    /* JADX INFO: renamed from: p72$a */
    public class a implements b<C4044gh0> {
        @Override // defpackage.C5869p72.b
        public final int a(C4044gh0 c4044gh0) {
            return c4044gh0.c;
        }

        @Override // defpackage.C5869p72.b
        public final boolean b(C4044gh0 c4044gh0) {
            return c4044gh0.d;
        }
    }

    /* JADX INFO: renamed from: p72$b */
    public interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    public C5869p72() {
        new ConcurrentHashMap();
    }

    public Typeface a(Context context, C3624eh0.c cVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, @NonNull C4044gh0[] c4044gh0Arr, int i) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File fileD = C6079q72.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (C6079q72.c(fileD, inputStream)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File fileD = C6079q72.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (C6079q72.b(fileD, resources, i)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public C4044gh0 e(int i, C4044gh0[] c4044gh0Arr) {
        a aVar = new a();
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C4044gh0 c4044gh0 = null;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (C4044gh0 c4044gh1 : c4044gh0Arr) {
            int iAbs = (Math.abs(aVar.a(c4044gh1) - i2) * 2) + (aVar.b(c4044gh1) == z ? 0 : 1);
            if (c4044gh0 == null || i3 > iAbs) {
                c4044gh0 = c4044gh1;
                i3 = iAbs;
            }
        }
        return c4044gh0;
    }
}
