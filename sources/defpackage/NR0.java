package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class NR0<T> implements InterfaceC6771tS<T> {
    public final Uri d;
    public final ContentResolver e;
    public T g;

    public NR0(ContentResolver contentResolver, Uri uri) {
        this.e = contentResolver;
        this.d = uri;
    }

    @Override // defpackage.InterfaceC6771tS
    public final void b() {
        T t = this.g;
        if (t != null) {
            try {
                d(t);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // defpackage.InterfaceC6771tS
    public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super T> aVar) {
        try {
            ?? r3 = (T) f(this.e, this.d);
            this.g = r3;
            aVar.f(r3);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.d(e);
        }
    }

    public abstract void d(T t);

    @Override // defpackage.InterfaceC6771tS
    @NonNull
    public final CS e() {
        return CS.d;
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // defpackage.InterfaceC6771tS
    public final void cancel() {
    }
}
