import * as React from 'react';
import { View, Text, ImageBackground } from 'react-native';
import imagemFundo from './../'

export interface LoginScreenProps {
}

export function LoginScreen(props: LoginScreenProps) {
  return (
    <View>
      <Text>Login Screen</Text>
    </View>
  );
}

export function componente() {
  return (<ImageBackground>
    <View>
      <Text>Olá Mundo!</Text>
    </View>
    </ImageBackground>)
}
