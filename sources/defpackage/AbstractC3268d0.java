package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3268d0 implements InterfaceC7828yU, EH {
    @Override // defpackage.InterfaceC7828yU
    public abstract short A();

    @Override // defpackage.InterfaceC7828yU
    public float B() {
        G();
        throw null;
    }

    @Override // defpackage.EH
    @Nullable
    public final Object C(@NotNull C6188qf1 descriptor, int i, @NotNull RJ0 deserializer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (deserializer.c().c() || w()) {
            return F(deserializer);
        }
        return null;
    }

    @Override // defpackage.EH
    public final long D(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return v();
    }

    @Override // defpackage.InterfaceC7828yU
    public double E() {
        G();
        throw null;
    }

    public final Object F(@NotNull RJ0 deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return d(deserializer);
    }

    @NotNull
    public final void G() {
        throw new ZH1(C2017Sp1.a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.EH
    public void b(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // defpackage.InterfaceC7828yU
    @NotNull
    public EH c(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // defpackage.InterfaceC7828yU
    public <T> T d(@NotNull RJ0 deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) deserializer.d(this);
    }

    @Override // defpackage.EH
    @NotNull
    public final InterfaceC7828yU e(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return q(descriptor.i(i));
    }

    @Override // defpackage.InterfaceC7828yU
    public boolean f() {
        G();
        throw null;
    }

    @Override // defpackage.InterfaceC7828yU
    public char g() {
        G();
        throw null;
    }

    @Override // defpackage.EH
    public final double i(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E();
    }

    @Override // defpackage.EH
    public final char j(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return g();
    }

    @Override // defpackage.EH
    public final float k(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return B();
    }

    @Override // defpackage.EH
    public final byte m(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return z();
    }

    @Override // defpackage.EH
    @NotNull
    public final String n(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return t();
    }

    @Override // defpackage.InterfaceC7828yU
    public abstract int o();

    @Override // defpackage.EH
    public final short p(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return A();
    }

    @Override // defpackage.InterfaceC7828yU
    @NotNull
    public InterfaceC7828yU q(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // defpackage.EH
    public <T> T r(@NotNull MH1 descriptor, int i, @NotNull RJ0 deserializer, @Nullable T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) F(deserializer);
    }

    @Override // defpackage.EH
    public final int s(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return o();
    }

    @Override // defpackage.InterfaceC7828yU
    @NotNull
    public String t() {
        G();
        throw null;
    }

    @Override // defpackage.InterfaceC7828yU
    public int u(@NotNull MH1 enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        G();
        throw null;
    }

    @Override // defpackage.InterfaceC7828yU
    public abstract long v();

    @Override // defpackage.InterfaceC7828yU
    public boolean w() {
        return true;
    }

    @Override // defpackage.EH
    public final boolean y(@NotNull C4933kh1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return f();
    }

    @Override // defpackage.InterfaceC7828yU
    public abstract byte z();
}
