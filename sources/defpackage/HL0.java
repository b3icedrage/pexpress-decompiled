package defpackage;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", l = {80, 121, 89}, m = "serialize")
public final class HL0<T> extends LM {
    public Object d;
    public Object e;
    public RJ0 g;
    public Charset h;
    public InterfaceC1958Rw i;
    public C6736tG0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ IL0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HL0(IL0 il0, LM lm) {
        super(lm);
        this.l = il0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return IL0.c(this.l, null, null, null, null, this);
    }
}
