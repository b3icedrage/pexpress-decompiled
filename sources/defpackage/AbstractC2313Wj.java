package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: renamed from: Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2313Wj<T> implements InterfaceC6771tS<T> {
    public final String d;
    public final AssetManager e;
    public T g;

    public AbstractC2313Wj(AssetManager assetManager, String str) {
        this.e = assetManager;
        this.d = str;
    }

    @Override // defpackage.InterfaceC6771tS
    public final void b() {
        T t = this.g;
        if (t == null) {
            return;
        }
        try {
            d(t);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.InterfaceC6771tS
    public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super T> aVar) {
        try {
            T tF = f(this.e, this.d);
            this.g = tF;
            aVar.f(tF);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.d(e);
        }
    }

    public abstract void d(T t);

    @Override // defpackage.InterfaceC6771tS
    @NonNull
    public final CS e() {
        return CS.d;
    }

    public abstract T f(AssetManager assetManager, String str);

    @Override // defpackage.InterfaceC6771tS
    public final void cancel() {
    }
}
