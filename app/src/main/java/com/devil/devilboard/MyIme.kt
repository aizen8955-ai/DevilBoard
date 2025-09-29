package com.devil.devilboard

import android.inputmethodservice.InputMethodService
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.view.View

class MyIme : InputMethodService(), KeyboardView.OnKeyboardActionListener {
        private lateinit var kv: KeyboardView
            private lateinit var keyboard: Keyboard

                override fun onCreateInputView(): View {
                            kv = layoutInflater.inflate(R.layout.ime_keyboard, null) as KeyboardView
                                    keyboard = Keyboard(this, R.xml.qwerty)
                                            kv.keyboard = keyboard
                                                    kv.setOnKeyboardActionListener(this)
                                                            return kv
                }

                    override fun onKey(primaryCode: Int, keyCodes: IntArray?) {
                                currentInputConnection.commitText(primaryCode.toChar().toString(), 1)
                    }

                        override fun onPress(p0: Int) {}
                            override fun onRelease(p0: Int) {}
                                override fun onText(p0: CharSequence?) {}
                                    override fun swipeLeft() {}
                                        override fun swipeRight() {}
                                            override fun swipeDown() {}
                                                override fun swipeUp() {}
}
                    }
                }
}