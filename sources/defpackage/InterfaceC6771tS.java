package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: tS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6771tS<T> {

    /* JADX INFO: renamed from: tS$a */
    public interface a<T> {
        void d(@NonNull Exception exc);

        void f(T t);
    }

    @NonNull
    Class<T> a();

    void b();

    void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull a<? super T> aVar);

    void cancel();

    @NonNull
    CS e();
}
